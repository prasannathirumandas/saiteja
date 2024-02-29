
public class BudzDem02 {

	public static void main(String[] args)
	{
		int grosssalary =10000;
		BudzDem02 bd1=new BudzDem02();
		int netsalary = grosssalary-bd1.housecharges();
		System.out.println(netsalary);
		int taxcal=30*bd1.housecharges();
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