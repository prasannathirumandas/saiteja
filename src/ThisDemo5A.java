
public class ThisDemo5A 
{
	int i;
	ThisDemo5A()
	{
		System.out.println("zero args of ThisDemo5A");
		i=20;
	}
	ThisDemo5A(int a)
	{
		this();
		System.out.println("int args of ThisDemo5A");
		a=i;
	}
	public static void main(String[] args) 
	{
		ThisDemo5A t1=new ThisDemo5A(30);
		System.out.println(t1.i);
	}

}
