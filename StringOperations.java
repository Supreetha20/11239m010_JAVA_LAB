public class StringOperations {
    public static void main(String[] args) {
        String str = "Java Programming";

        System.out.println("Length: " + str.length());
        System.out.println("Char at 5: " + str.charAt(5));
        System.out.println("Substring: " + str.substring(5, 16));
        System.out.println("Contains 'Pro': " + str.contains("Pro"));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Replaced: " + str.replace('a', 'x'));
    }
}
