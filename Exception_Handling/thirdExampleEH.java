// Null Pointer Exception in Java

public class thirdExampleEH {
    public static void main(String args[]) {
        String text = null;
        try {
            System.out.println(text.length()); // null pointer exception !
        } catch (NullPointerException e) {
            System.out.println("Cannot access the properties of the null object !");
        }
    }
}
