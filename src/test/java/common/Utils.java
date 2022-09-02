package common;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Utils {

    public static String YesterdayDate(){
        Calendar cal = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
//        System.out.println("Today: "+dateFormat.format(cal.getTime()));
        cal.add(Calendar.DATE,-1);
//        System.out.println("Yesterday: "+dateFormat.format(cal.getTime()));
        String Yesterday = dateFormat.format(cal.getTime());
        return Yesterday;
    }

//    public static void main(String[] args) {
//        Utils ut = new Utils();
//        ut.YesterdayDate();
//    }
}
