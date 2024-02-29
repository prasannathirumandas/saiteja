package inheritancedemo;

public class RBIBankTest3 
{
public static void main(String[] args) {
		
		RBIBank r1 = new RBIBank();
        r1.cBillscore();
        
        RBIBank r2 = new HDFCBank();//Up-casting
        r2.cBillscore();

}
}
