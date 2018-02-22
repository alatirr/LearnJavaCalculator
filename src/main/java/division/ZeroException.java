package division;

public class ZeroException extends Exception {
   final private String message = "You can not divide by zero";

    public ZeroException() {
         System.out.println(this.message);
    }
}
