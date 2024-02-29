
public class BudzDemo3
{

	public static void main(String[] args)
	{
		int grosssalary =10000;
		BudzDemo3 bd1=new BudzDemo3();
		int charges=bd1.housecharges();
		int netsalary = grosssalary-charges;
		System.out.println(netsalary);
		int taxcal=30*charges;
		System.out.println(taxcal);
	}
	int housecharges()
	{
		System.out.println("housecharges is invoking");
		int rent=2000;
		int childfee=1000;
		int totalcharges=rent+childfee;
		System.out.println(totalcharges);
		return totalcharges;
		
	} 

}
