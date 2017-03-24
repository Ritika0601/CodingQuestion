static boolean flag = false;
static int B,H;
static{
    Scanner in = new Scanner(System.in);
   B = in.nextInt();
   H = in.nextInt();
    if (B>0 && H >0)
       flag = true; 
    else
    System.out.print("java.lang.Exception: Breadth and height must be positive");   
}
