
public class ArrayDemo5 
{

	public static void main(String[] args) 
	{
	int k[]={10,20,30,40,50};
	ArrayDemo5 a1=new ArrayDemo5();
	a1.funA(k);
	}
	void funA(int arr[])
	{
		/*System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]); */
		 int size=arr.length;
		 for(int i=0;i<size;i++)
		 {
			 System.out.println(arr[i]);
		 }
		
	}

}
