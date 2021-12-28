import java.util.Scanner;
class  Prime
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the lower bound");
		int l=scn.nextInt();
		System.out.println("enter the upper bound");
		int u=scn.nextInt();
		while (l<=u)
		{
			boolean flag=true;
			for (int i=2;i<=l/2 ;i++ )
			{
				
				if (l%i==0)
				{
					flag=false;
					break;

				}
			}
			if (flag)
			{
				System.out.println("l="+l);
			}
			
			
			++l;

		}
	}
}
