
public class MethodDemo7A
{

	public static void main(String[] args) 
	{
	System.out.println("Main Method of MethodDemo7A");
	MethodDemo7A m1=new MethodDemo7A();
	m1.funB();
	MethodDemo7A m2=new MethodDemo7A();
	m2.funB();
	}
void funA()
{
	System.out.println(" funA of MethodDemo7A");
}
void funB()
{
	System.out.println(" funB of MethodDemo7A");
	this.funA();

}
}
