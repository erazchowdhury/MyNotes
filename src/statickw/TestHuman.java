package statickw;

public class TestHuman {

    public static void main(String[] args) {

        Human human = new Human();

        //access non-static attributes and methods: use an object
        System.out.println(human.height);
        human.person1();

        //access static attributes and methods: use the class name only
        System.out.println(Human.weight);
        Human.person2();

    }

}
