
public class HexDemo2 {

	public static void main(String[] args) {
		
		int a =122;
		String h = Integer.toHexString(a);
		// String h1 = new String(Integer.toHexString(a));
		System.out.println(h);
		String value = "U+"+h.toUpperCase();
		System.out.println(value);
	}

}
