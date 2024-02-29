
public class PolyDemo2 
{

	public static void main(String[] args) 
	{
		PolyDemo2 p1=new PolyDemo2();
		p1.funA();
		p1.funA(10l,20);
		p1.funA(10,20l);

	}
	void funA()
	{
		System.out.println("zero args of PolyDemo2");
	}
	void funA(long a,int b)
	{
		System.out.println("long int args of PolyDemo2");
	}
	void funA(int a,long b)
	{
		System.out.println("int long args of PolyDemo2");
	}


}
