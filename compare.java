import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)   {
        Scanner sc=new Scanner(System.in);
          String s=sc.next();
        int n=sc.nextInt();
      
        String max=s.substring(0,n);
         String min=s.substring(0,n);
        int len=s.length();
        for(int i=1;i<=len-n;i++){
            String result=s.substring(i,n+i);
            if(result.compareTo(max)>0){
                max=result;
            }
            if(result.compareTo(min)<0){
                min=result;
            }
        }
          System.out.println(min);
        System.out.println(max);
       
        
    }}
