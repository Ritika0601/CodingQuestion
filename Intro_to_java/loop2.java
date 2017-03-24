import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=1;j<=n;j++){
                int y=a+b;
                int z=1;
           for(int k=1;k<=j;k++){
                    z*=2;
                }int m=0;
                    m=m+z*b;
                    y=y+m-b*2;
                    System.out.print(y+" "); 
            }
          System.out.println();  
        }
        in.close();
    }
}