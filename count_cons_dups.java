import java.util.*;
public class coount_cons_dups
{
	public static void main(String[] args)
	{
		Scanner io=new Scanner(System.in);
		System.out.println("enter the string");
		String str=io.next();
		int n=str.length();
		char[] input=str.toCharArray();
		int count=0,pos,tra;
		for(pos=0,tra=0;tra<n;tra++)
		{
			if(input[pos]==input[tra])
			{
				count++;
			}
			else
			{
				System.out.print(input[pos]+""+count);
				pos=tra;
				count=1;
			}
		}
		System.out.print(input[pos]+""+count);

	}
}