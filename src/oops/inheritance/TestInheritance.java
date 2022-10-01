package oops.inheritance;

public class TestInheritance {
    public static void main(String[] args) {


        Father jack = new Father();
        jack.athletic();
        jack.height();
        jack.rich();

        Child kevin = new Child();
        kevin.athletic();
        kevin.height();
        kevin.rich();
        kevin.communicate();

        Grandfather bob = new Grandfather();
        bob.rich();

        Bird sparrow = new Bird();
        sparrow.communicate();

    }
}
