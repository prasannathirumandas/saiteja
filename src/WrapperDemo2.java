
public class WrapperDemo2 
{

	public static void main(String[] args)
	{
		String requiredAirMiles="5000";
		int creditBalance=4000;
		int airMiles=Integer.parseInt(requiredAirMiles);
		//if(creditBalance>=requiredAirMiles)
		if(creditBalance>=airMiles)
				{
			System.out.println("airmiles are available");
				}
		else
		{
			System.out.println("airmiles are not available");
		}
		
	}
}
