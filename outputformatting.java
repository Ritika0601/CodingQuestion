for(int i=0;i<3;i++){
                String s=sc.next();
                int x=sc.nextInt();
                System.out.print(s);
                for(int j=1;j<=15-s.length();j++)
                    {
                    System.out.print(" ");
                }
                if(x<10)
                    System.out.print("00"+x);
                    if(x>=10 && x<100)
                        System.out.print("0"+x);
                    if(x>=100 &&  x<1000)
                        {
                        System.out.print(x);
                    }
            
                System.out.println();
            }
