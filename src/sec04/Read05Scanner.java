package sec04;

import java.util.Scanner;


public class Read05Scanner {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();
		
		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();
		// 읽어들인 문자열을 숫자로 변환
		int num1 = Integer.parseInt(strNum1);          //parseInt< 해석
	
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
	}

}

