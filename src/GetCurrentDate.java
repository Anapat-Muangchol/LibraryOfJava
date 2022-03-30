import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class GetCurrentDate {
    public static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.US); // 2021-07-31

    public static void main(String[] args) {
        System.out.print(getCurrentDate());
    }

    private static String getCurrentDate() {
        Date now = new Date();
        return format.format(now);
    }

}
