
public class ArraysDemo3 
{

	public static void main(String[] args)
	{
		int arr[][]=new int[3][4];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[0][3]=40;
		arr[1][0]=50;
		arr[1][1]=60;
		arr[1][2]=70;
		arr[1][3]=80;
		arr[2][0]=90;
		arr[2][1]=100;
		arr[2][2]=110;
		arr[2][3]=120;
		System.out.println(arr[0][0]);

		int rowCount=arr.length;
		int colCount=arr[0].length;

		for(int i=0;i<rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				System.out.println(arr[i][j]);
			}

		}


	}

}
