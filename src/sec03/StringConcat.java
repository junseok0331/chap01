package sec03;

public class StringConcat {
	public static void main(String[] args) {
		// 숫자연산 문자열
		int value = 10 + 2 + 8;
		System.out.println("value; " + value );
		
		//결합연산(왼쪽 부터 순서대로)
		String strl = 10 + 2 + "8";
		System.out.println("strl: " + strl);   // 128
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2: " + str2);   // 1028
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3: " + str3);  // 1028
		
		String str4 = "10" + (2 + 8);  // 괄호가 있으면 괄호  먼저 연산 
		System.out.println("str4: " + str4);    // 1010
     	}

}
