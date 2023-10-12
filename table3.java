
public class Tableof3
{
	
	
	public static void main(String[] args) {
		for(int row=1; row<=4;row++)
		{
			for(int column=1;column<=4;column++)
			{
				if(row%2==0)
				{
					
					System.out.print(sum+" ");
					sum=sum+3;
				}
				//if(row%2==1)
				else
				{
					
					System.out.print(sum+" ");
					sum=sum+3;
				}
			}
			System.out.println();
		}
	}
}
