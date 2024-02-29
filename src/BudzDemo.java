
public class BudzDemo
{

	public static void main(String[] args)
	{
		int grosssalary =10000;
	BudzDemo bd1=new BudzDemo();
		// int netsalary = grosssalary-totalcharges;
		int netsalary = grosssalary-bd1.housecharges2();
		System.out.println(netsalary);
	}
	void housecharges()
	{
		int rent=2000;
		int childfee=1000;
		int totalcharges=rent+childfee;
	}
	int housecharges2()
	{
		int rent=2000;
		int childfee=1000;
		int totalcharges=rent+childfee;
		System.out.println(totalcharges);
		return totalcharges;
		
		
	}

}
