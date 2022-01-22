package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Honda").print();
        createObject("Toyota").print();
        createObject("Lexus").print();
      /*  Toyota toyota = new Toyota("Camry","2005");
        Honda honda = new Honda("Accord","2002");
        Lexus lexus = new Lexus("Gx470","2010");

        Car[] cars = {toyota,honda,lexus};*/

      /*  System.out.println("модель " + toyota.getName() + " год выпуска " + toyota.getYears());
*/
        ///System.out.println("модель " + honda.getName() + " год выпуска " + honda.age());
        ///System.out.println("модель " + toyota.getName() + " год выпуска " + toyota.age());
        ///System.out.println("модель " + lexus.getName() + " год выпуска " + lexus.age());


	// write your code here
    }

    public static Car createObject(String className) {
        switch (className) {
            case "Toyota":
                return new Toyota("Camry","2005");
            case "Honda":
                return new Honda("Accord","2002");
            case "Lexus":
                return new Lexus("Gx470","2010");
            default:
                return null;
        }
    }
}
