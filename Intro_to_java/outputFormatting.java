import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.print(s1);
                int len = s1.length();
                int y = 15-len ;
                for(int j=1;j<=y;j++)
                   { System.out.print(" ");
                    } 
                if(x<10)
                    System.out.print("00"+x);
                if((x>=10)&&(x<100))
                    System.out.print("0"+x);
                if ((x>=100)&&(x<1000))
                    System.out.print(x);
                System.out.println();
            }
            System.out.println("================================");

    }
}
