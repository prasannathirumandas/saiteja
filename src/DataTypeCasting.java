
public class DataTypeCasting 
{

	public static void main(String[] args) 
	{
		int a=10;
		//float f1=10;
		float f1=a; //implicit data type casting
		System.out.println(f1);
		long k=30000;
		float f2=k; //implicit data type casting
		System.out.println(f2);
		double d1=f2;//implicit data type casting
		//float f3=10.9878987677;
		float f3=(float)10.9878987677;//explicit data type casting
		System.out.println(f3);
		//int b=10.34;
		int b=(int)10.34;//explicit data type casting
		System.out.println(b);
		float f4=10.23f;
		
	}

}
