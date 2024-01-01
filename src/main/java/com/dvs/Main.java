package com.dvs;

public class Main {
    public static void main(String[] args) {

        GenericDriver James = new GenericDriver("James",true);
        James.deduct(3);
        James.setMedicalReport();
        CommercialDriver Grace = new CommercialDriver("Grace",false,"inflammable", "truck");
        Grace.deduct(5);
        Grace.setMedicalReport();
        GenericDriver[] driverArray = new GenericDriver[2];
        driverArray[0] = James;
        driverArray[1] = Grace; //upcast to GenericDriver

        for(int i = 0; i < driverArray.length; i++){
            System.out.println(driverArray[i].getName() +
                    "'s license is provisional: " +
                    driverArray[i].getIsProvisional());
                    System.out.println(driverArray[i].getName() + " has " +
                            driverArray[i].getPoints() + " points");
            System.out.println(driverArray[i].getMedicalReport());
        }
    }
}