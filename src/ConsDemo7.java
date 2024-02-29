
public class ConsDemo7 
{
	int a=10;
	ConsDemo7(int i)
	{
		System.out.println("cons of ConsDemo7");
		a=i;
	}
	public static void main(String[] args) 
	{
		System.out.println("main method start");
		ConsDemo7 c1=new ConsDemo7(20);
		System.out.println(c1.a);
		ConsDemo7 c2=new ConsDemo7(30);
		System.out.println(c2.a);
		System.out.println("Done");
	}



}
