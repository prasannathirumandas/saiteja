
public class ThisDemo3 
{
	int a=10;
	void funA()
	{
		System.out.println("funA of ThisDemo3");
	}
	void funB()
	{
		System.out.println("funB of ThisDemo3");
		System.out.println(a);
		funA();	
	}

}
