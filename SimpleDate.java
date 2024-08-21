import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date format change:");

        // Use SimpleDateFormat to format the date
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = simpleDateFormat.format(date);

        System.out.println("Date format with (MM/dd/yyyy): " + strDate);

        simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        strDate = simpleDateFormat.format(date);
        System.out.println(strDate);

        simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
        strDate = simpleDateFormat.format(date);
        System.out.println(strDate);

        simpleDateFormat = new SimpleDateFormat("dd MM yyyy zzzz");
        strDate = simpleDateFormat.format(date);
        System.out.println(strDate);

        simpleDateFormat = new SimpleDateFormat("E, dd-MM-yyyy hh:mm:ss z");
        strDate = simpleDateFormat.format(date);
        System.out.println(strDate);
    }
}
