package datatype.primitive;

public class Variables {

    public static void main(String[] args) {

        //syntax: variableType variableName = variableValue;

        //primitive variables
        //numbers
        //whole number
        byte b = 127;//1 byte
        short s = 2542;//2 bytes
        int x = 2147483647;//4 bytes
        long l = 65425L;//8 bytes

        //variable declaration
        int i;
        //variable assignment
        i = 52;

        //use strong names / camel case
        int ageOfTheDog = 25;

        int total = i + x;

        //fractions
        float f = 1.255454F;//4 bytes
        double d = 1.12345;//8 bytes

        //character
        char a1 = '1';//2 bytes
        char a2 = '&';

        //boolean
        boolean boo = true;//1 bit

        System.out.println(25+85);

        System.out.println(a1+a2);


        int n, k ,p;

        //reassignment
        String name = "john";

        System.out.println(name);

        name = "dave";

        System.out.println(name);

        //java logic:
        // arithmetic operators: +, -, /, *, %, ++,--
        ageOfTheDog++;
        System.out.println(ageOfTheDog);

        //assignment operators: =, +=, -=
        int example = 10;
        example += 1; // adds 1 to the variable and reassigns the value, x = x + 1
        example -= 1; // subtracts 1 and reassigns the value, x = x - 1
        example *= 5; // multiplies by 5 and reassigns, x = x * 5
        example /= 5; // divides by 5 and reassigns, x = x / 5
        example %= 8; // divides by 8 and takes the remainder and assigns it to the variable,x = x % 8

        //comparison operators: <, >, <=, >=, !=, ==
        String s1 = "hello";
        String s2 = "Hello";
        System.out.println(s1!=s2);
        System.out.println(10>9);

        //logical operators: &&, ||, !

        String st = "my name is: \"John\"";

        System.out.println("Hello \\  \n \t World");

        //final keyword in variables: you cannot reassign a final variable
        final int age = 20;
//        age = 25; cannot do because age is final


    }

}
