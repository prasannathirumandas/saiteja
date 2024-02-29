
public class StaticDemo4A 
{

	public static void main(String[] args) 
	{
		StaticDemo3 s1= new StaticDemo3();
		System.out.println(s1.b);
		s1.a1.funA();
		System.out.println(StaticDemo3.b);
		StaticDemo3.a1.funA();
	}

}
