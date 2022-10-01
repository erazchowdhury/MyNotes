package classobjectmethod;

import classobjectconstructor.House;

public class UseCalculator {

    public static void main(String[] args) {

        //object: instance of a class
        //syntax: ClassName objectName = new ClassName();
        Calculator cal = new Calculator();

        int myTotal = cal.addition();
        System.out.println(myTotal);

        double mySurface = cal.surface(25.5, 36.0);
        System.out.println(mySurface);

        int myTemperature = cal.cToF(0);
        System.out.println(myTemperature);

        String myName = cal.myName();
        System.out.println("Hi "+myName+" welcome to Java class");

        cal.subtraction(); // returns nothing since method is void type

        House house = new House();

        House house1 = new House("new house");

        House house2 = new House("new house", 5241);

    }

}
