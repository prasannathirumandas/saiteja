
public class WrapperDemo3 
{

	public static void main(String[] args)
	{
		String flightCharges="$4500";
		int creditBalance=4000;
		int charges=Integer.parseInt(flightCharges);
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

}
