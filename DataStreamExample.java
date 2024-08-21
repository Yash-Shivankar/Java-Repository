import java.io.FileInputStream;

public class DataStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("D:\\text.txt");
            int i = file.read();
            System.out.println((char)i);
            file.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
