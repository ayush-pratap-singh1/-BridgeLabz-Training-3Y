// Short example: StringIndexOutOfBoundsException
public class StringIndexOutOfBoundsException{
    public static void main(String[] args) {
        String s = "Hello";

        // This will throw: index 5 is out of range (0..4)
        char c = s.charAt(3);
        System.out.println(c);
    }
}