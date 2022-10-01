package oops.polymorphism;

public class ModernCalculator extends Calculator{

    //method overriding: when method in subclass uses the same name and same parameters but different body
    @Override
    public int sub(int x, int y) {
        int total = x - y + 10;
        return total;
    }
}
