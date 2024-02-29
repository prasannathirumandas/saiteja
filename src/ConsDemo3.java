
public class ConsDemo3 
{
    int a=10;
	ConsDemo3()
	{
		System.out.println("cons of ConsDemo3");
		a=15;
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("main method of ConsDemo3");
		ConsDemo3 c1=new ConsDemo3();
		System.out.println(c1.a);
		System.out.println("Done");

		
	}
}
