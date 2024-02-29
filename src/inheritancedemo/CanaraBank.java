package inheritancedemo;

public class CanaraBank 
{
public static void main(String[] args) {
		
		RBIBank r1 = new RBIBank();
        r1.cBillscore();
        
        CanaraBank c1 = new CanaraBank();
        c1.croploan();    
	}
   void croploan()
   {
	   System.out.println("croploan of CanaraBank");
   }
	
}
