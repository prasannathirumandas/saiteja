
public class MethodDemo2 {

	public static void main(String[] args) 
	{
		System.out.println("Main method of MethodDemo2");
		funC();
		//funA();
		//funB();
		MethodDemo2 m1=new MethodDemo2();
		m1.funA();
		m1.funB();
	}
void funA()
{
	System.out.println("funA of MethodDemo2");

}
void funB()
{
	System.out.println("funB of MethodDemo2");

}

static void funC()
{
	System.out.println("funC of MethodDemo2");

}
}
