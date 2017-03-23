import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len1=A.length ();
        int len2=B.length ();
        int len=len1+len2;
        char c1=A.charAt(0);
        char c2=B.charAt(0);
        int a1=(char)c1;
        int a2=(char)c2;
        System.out.println(len);
        if(a1<a2){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        char c3=Character.toUpperCase(c1);
        char c4=Character.toUpperCase(c2);
        String s="";
        for(int i=1;i<len1;i++){
            char ch=A.charAt(i);
            s=s+ch;
            
        }
        String ss="";
        for(int j=1;j<len2;j++){
            char ch1=B.charAt(j);
            ss=ss+ch1;
        }
        String s1=c3+s+" "+c4+ss;
        System.out.println(s1);
        
        
        
        
        
        
    }
}
