import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        int len=S.length();
        String s="";
        for(int i=start;i<end;i++){
            char ch=S.charAt(i);
            s=s+ch;
            
            
        }
         System.out.println(s); 
        
    }
}
