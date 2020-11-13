package Practice4;

import java.util.Calendar;

public class Order {
    public static  String Normalize(int num){
        if(num > 0 && num<10){
            return "0" + num;
        }
        else{
            return String.valueOf(num);
        }
    }
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);

        int month = cal.get(Calendar.MONTH)+1;
        String month1 = Normalize(month);

        int day = cal.get(Calendar.DATE);
        String day1 = Normalize(day);

        int hour = cal.get(Calendar.HOUR_OF_DAY);
        String hour1 = Normalize(hour);

        int minute = cal.get(Calendar.MINUTE);
        String minute1 = Normalize(minute);

        int second = cal.get(Calendar.SECOND);
        String second1 = Normalize(second);

        String date = ""+year+month1+day1+hour1+minute1+second1;
        String admin = "Cassie8910";
        String orderStr = "D"+date.concat(admin);
        System.out.println("订单号："+ orderStr);
    }
}
