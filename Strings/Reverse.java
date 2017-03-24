import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String temp = "";
        int len = A.length();
        for (int i=0;i<len;i++)
          {
            char ch = A.charAt(len-1-i);
            temp = temp+ch;
        }
        
       if (temp.compareTo(A)==0)
            System.out.println("Yes");
        else
            System.out.println("No"); 
        
    }
}