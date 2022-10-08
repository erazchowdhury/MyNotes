package exception_handling;

public class LearnExceptionHandling {

    public static void main(String[] args) {

        String str = "JaCa is an IslAnd";
        char[] strArr = str.toLowerCase().toCharArray();
        int length = strArr.length;

        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {

        }

        for (int i = 0; i <= length; i++) {
            try {
                System.out.println(strArr[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            } catch (IndexOutOfBoundsException e2) {
                e2.getCause();
            }
        }

        LearnExceptionHandling obj = new LearnExceptionHandling();
        obj.divide(10,0);

    }

    public int divide(int num1, int num2) throws ArithmeticException{
        if (num2 == 0) {
            throw new ArithmeticException();
        }
        return num1 / num2;
    }

}
