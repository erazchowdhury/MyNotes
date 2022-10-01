package classobjectconstructor;

public class UseHouse {

    public static void main(String[] args) {

        House myHouse = new House("white house", 1236);
        System.out.println(myHouse.houseName);
        System.out.println(myHouse.address);

        myHouse.room();

        House yourHouse = new House("the millennium");
        yourHouse.bathRoom();

        House theHouse = new House();
        theHouse.bathRoom();

    }

}
