int t=in.nextInt();
        for(int i=0;i<t;i++)
            {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
              
           
            int p=1;
        int z=0; String str="";
        for(int j=1;j<=n;j++)
            {
            
            z=z+p*b;
            p=2*p; int x=a+z;
            str=str+x+" ";
            
        }
            System.out.println(str);
            
           
        }    
