package oops.polymorphism;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int add = cal.add(52,85);
        int anotherAdd = cal.add(10,20, 30);
        System.out.println(add);
        System.out.println(anotherAdd);
    }
}
