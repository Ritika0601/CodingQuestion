import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        String s = in.next();
        int x = in.nextInt();
        int len = s.length();
        String str = s.substring(0,x);
        String max = str; String min = str;
        for (int i=1;i<=(len-x);i++)
        { String str2 = s.substring(i,i+x);
         int y = max.compareTo(str2);
         if (y<0)
          max = str2;
         int z = min.compareTo(str2);
         if (z>0)
          min = str2;
          }
        System.out.println(min);
         System.out.println(max);
        
    }
}