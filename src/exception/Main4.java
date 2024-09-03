package exception;

public class Main4 {
    public static void main(String[] args) {
        try {
            long[] arr = new long[Integer.MAX_VALUE];
            int a = 3 / 0;
        } catch (OutOfMemoryError e) {
            System.out.println("Error " + e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("Error2");
        }
        System.out.println("Done");
    }
}
