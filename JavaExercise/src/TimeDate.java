import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class TimeDate {
    public static void simpleDate(){
        Date date = new Date();
        String dateFormatStr = "yyyy-MM-dd HH:mm:ss a";
        //SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatStr);
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        dateFormat.applyPattern(dateFormatStr);
        System.out.println(dateFormat.format(date));
    }
    public static void calendar(){
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DATE);
        int doy = cal.get(Calendar.DAY_OF_YEAR);
        int dom = cal.get(Calendar.DAY_OF_MONTH);
        int dow = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println("当期时间: " + cal.getTime());
        System.out.print("年份: " + year);
        System.out.print(" 月份: " + month);
        System.out.println(" 日期: " + day);
        System.out.println("一年的第几天: " + doy);
        System.out.println("一月中的第几天: " + dom);
        System.out.println("一周的第几天: " + dow);  // 星期日为一周的第一天
    }
    public static void timeMill(){
        Long timeStamp = System.currentTimeMillis();//自1970年1月1日0时起的毫秒数
        Date date = new Date(timeStamp);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        System.out.println(dateFormat.format(date));
    }
}
