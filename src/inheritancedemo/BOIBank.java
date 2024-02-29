package inheritancedemo;

public class BOIBank extends RBIBank
{
public static void main(String[] args) {
		
		BOIBank b1 = new BOIBank();
		b1.cBillscore();
        b1.croploan();
	}
	 void croploan()
	   {
		   System.out.println("croploan of BOIBank");
	   }
		

}
