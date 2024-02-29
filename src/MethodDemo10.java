
public class MethodDemo10 
{

	public static void main(String[] args)
	{
		System.out.println("Main method of MethodDemo10");
		MethodDemo10 m1=new MethodDemo10();
		m1.funA();
		m1.funB();
		System.out.println("Done");

	}
	void funA()
	{
		int a=10;
		int b=20;
		int c =a+b;
		System.out.println(c);
	}
	int funB()
	{
		int a=10;
		int b=20;
		int c =a+b;
		System.out.println(c);
		return 3000;
	}
	

}
