public class Notepad {
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();
        try {
            rs.exec("Notepad");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
