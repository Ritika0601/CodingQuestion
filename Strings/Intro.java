import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int len1 = A.length();
        int len2 = B.length();
        int x = (A.compareTo(B));
        System.out.println(len1+len2);
        if (x<=0)
          System.out.println("No");
        else
            System.out.println("Yes");
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase()+" "+B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase());
        
        
        
        
    }
}
