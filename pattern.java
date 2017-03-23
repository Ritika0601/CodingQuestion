public static void main (String args[])
{
	int a=5;
	int b=a-1;
	for(int i=1;i<=a;i++)
	{   for (int k=1;k<=b;k++)
		{
			System.out.print(" ");
		}   b--;
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
        System.out.println();
	}
}
