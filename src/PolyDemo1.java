 
public class PolyDemo1
{

	public static void main(String[] args)
	{
		PolyDemo1 p1= new PolyDemo1();
		p1.funA();
		p1.funA(10);
		p1.funA(10.23f);
	}
void funA()
{
	System.out.println("zero args of funA");
}
void funA(int a)
{
	System.out.println("int  args of funA");
	System.out.println(a);
}
void funA(long a)
{
	System.out.println("long args of funA");
	System.out.println(a);
	}
void funA(float a)
{
	System.out.println("float args of funA");
	System.out.println(a);
}
void funA(double a)
	{
		System.out.println("double args of funA");
		System.out.println(a);
		}
	}

