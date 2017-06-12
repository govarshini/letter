import java.util.*;
class letter
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		if(a>'a'&&'z'>a)
		System.out.println("alphabet");
		else
		System.out.println("not");
	}
}
