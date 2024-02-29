
public class GenericDemo1<T> 
{


		public static void main(String[] args)
		{
			
			GenericDemo1 g1 = new GenericDemo1();
			g1.funA(10);
			g1.funA(true);
			g1.funA("Selenium");
			g1.funA(new A());
		}
	   void funA(T t1)
	   {
		   System.out.println(t1);
	   }
	

}
