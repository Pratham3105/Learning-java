public class AsciiDemo {

	public static void main(String[] args) {
		
		char ch1 = 'z';
		int as1 = (int)ch1;
		System.out.println("Ascii value : "+as1);
		
		
		String hexcode = Integer.toHexString(as1);
		System.out.println("Hexadecimal : "+hexcode);
		String UniCodeValue = "U+"+hexcode.toUpperCase();
		System.out.println("Unicode value : "+UniCodeValue);
		
		
		char ch2 = '%';
		int as2 = (int)ch2;
		System.out.println("Ascii value : "+as2);
		
		
		String hexcode1 = Integer.toHexString(as2);
		System.out.println("Hexadecimal : "+hexcode1);
		String UniCodeValue1 = "U+"+hexcode1.toUpperCase();
		System.out.println("Unicode value : "+UniCodeValue1);
	}

}
