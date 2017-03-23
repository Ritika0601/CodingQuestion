import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Calendar;
public class Solution {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt()-1;
        int dd = in.nextInt();
        int year = in.nextInt();
       Date date=(new GregorianCalendar(year,month,dd)).getTime();
        SimpleDateFormat f=new SimpleDateFormat("EEEE");
        String day=f.format(date);
        System.out.println(day.toUpperCase());

    }
}
