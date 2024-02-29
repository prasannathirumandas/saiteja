package inheritancedemo;

public class HDFCBank extends RBIBank
{
	HDFCBank()
	{
       System.out.println("cons of HDFCBank");
	}
	public static void main(String[] args)
	{
		HDFCBank h1=new HDFCBank();
		h1.cBillscore();
	}
  void cBillscore()
  {
	  System.out.println("HDFCBank of RBIBank is 750");
  }
}
