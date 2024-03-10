//Display char at odd index position
public class StringDemo4 {

	public static void main(String[] args) {
		
		String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i =0;i<s1.length();i++)
		{
			if(i%2!=0)
			{
				
				System.out.println("char at index "+i+":"+s1.charAt(i));
			}
		}

	}

}
