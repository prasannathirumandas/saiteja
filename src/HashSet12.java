import java.util.HashSet;

public class HashSet12 {

	public static void main(String[] args)
	{
		String a[]={"java","util","java","amb"};
		HashSet<String> langs=new HashSet<>();
		
		for(String l:a)
		{
			System.out.println(langs.add(l));
		}
		System.out.println(langs);
		
		
	}

}
