package inheritancedemo;

public class RBIBankTest2 
{
public static void main(String[] args) {
		
		RBIBank r1 = new RBIBank();
        r1.cBillscore();
        
		HDFCBank h1 = new HDFCBank();
        h1.cBillscore();
		
		ICICIBank i1 = new ICICIBank();
		i1.cBillscore();

        AxisBank a1 =new  AxisBank();
        a1.cBillscore();
}

}
