package day13.api.lang.string;

public class String1 {
	public static void main(String[] args) {
		String str = "사과";
		String str2 = new String("바나나");
		String str3 = new String(new char[] { "바", "나", "나" });

		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);

		// charAt()
		System.out.println(str.charAt(0));

	}
}
