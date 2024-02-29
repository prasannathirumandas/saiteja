
public class GenericDemo2<G> 
{
	public static void main(String[] args) {
		GenericDemo2 <String> g1 = new GenericDemo2<String>();
		g1.funA("Selenium");
	//	g1.funA(10);
	//	g1.funA(true);
		
		GenericDemo2 <A> g2 = new GenericDemo2<A>();
		g2.funA(new A());
		
	//	GenericDemo2 <int> g2 = new GenericDemo2<int>();
		GenericDemo2 <Integer> g3 = new GenericDemo2<Integer>();
		g3.funA(10);
		
//		GenericDemo2 <boolean> g4 = new GenericDemo2<boolean>();
	    GenericDemo2 <Boolean> g4 = new GenericDemo2<Boolean>();
		g4.funA(true);
			
	
	}
   void funA(G g1)
   {
	   System.out.println(g1);
   }

}
