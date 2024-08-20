

public class StringMethods {
    public static void main(String[] args) {
        int n;
        String s = "Java Programming";
        System.out.println(s);
        n = s.length();
        System.out.println("Number of character =" +n);
        String t = s.replace("Java", "Python");
        System.out.println(t);
        String u = s.concat(" is fun");
        System.out.println(u);
    }
}
