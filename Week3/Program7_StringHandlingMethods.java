public class StringHandlingMethods {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Programming";
        String s3 = "Java";

        System.out.println("charAt(): " + s1.charAt(2));
        System.out.println("compareTo(): " + s1.compareTo(s2));
        System.out.println("equals(): " + s1.equals(s3));
        System.out.println("indexOf(): " + s2.indexOf('g'));
        System.out.println("join(): " + String.join("-", "Core", "Java"));
        System.out.println("replace(): " + s2.replace('a', 'A'));
        System.out.println("substring(): " + s2.substring(3, 8));
        System.out.println("toUpperCase(): " + s1.toUpperCase());
        System.out.println("toLowerCase(): " + s2.toLowerCase());
    }
}
