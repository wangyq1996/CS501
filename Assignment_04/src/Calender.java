import java.util.GregorianCalendar;

public class Calender {

    public static void main(String []args){
        GregorianCalendar d = new GregorianCalendar();
        System.out.println(d.get(GregorianCalendar.YEAR));
        System.out.println(d.get(GregorianCalendar.MONTH)+1);
        System.out.println(d.get(GregorianCalendar.DAY_OF_MONTH));
        d.setTimeInMillis(1234567898765L);
        System.out.println(d.get(GregorianCalendar.YEAR));
        System.out.println(d.get(GregorianCalendar.MONTH)+1);
        System.out.println(d.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
