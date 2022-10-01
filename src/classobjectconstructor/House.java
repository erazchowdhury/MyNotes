package classobjectconstructor;

public class House {

    //variables
    int address;
    String houseName;
    private char unit;

    //constructor
    //built constructors
    public House(String myHouseName) {
        houseName = myHouseName;
    }

    public House(String myHouseName, int myAddress){
        houseName = myHouseName;
        address = myAddress;
    }

    //default constructor, java creates one of these for every class automatically, but it's hidden
    /*the default constructor has a default access modifier, meaning any object created using this class
    can only be used within this package. Adding public makes the constructor global, allowing the usage
    of the object anywhere.*/
    public House(){

    }

    //methods
    void kitchen() {
        System.out.println("eat the whole day");
    }

    void room() {
        System.out.println("sleep");
    }

    void bathRoom() {
        System.out.println("shower");
    }

}
