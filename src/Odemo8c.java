
public class Odemo8c 
{

	public static void main(String[] args)
	{
		Odemo8c o1= new Odemo8c();
		VariableDemo1 a= new VariableDemo1();
		o1.fun1(a);
		o1.fun1(new VariableDemo1());
		o1.fun1(null);
	}
	void fun1(VariableDemo1 v1)
	{
		System.out.println(v1);
	}
}
