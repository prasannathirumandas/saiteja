
public class Odemo10b 
{
A getA(int x)
{
	A a1=new A();
	a1.i=x;
	a1.j=x+1;
	return a1;
}
	public static void main(String[] args)
	{
		Odemo10b d1= new Odemo10b()	;
		A x=d1.getA(4);
		System.out.println(x);
		System.out.println(x);
		System.out.println(x);
		System.out.println(d1.getA(8));
		System.out.println(d1.getA(8));
		System.out.println(d1.getA(8));
	}

}
