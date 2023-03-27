package sec04;
/**
 *  키보드에서 캐릭터(char)를 읽어들이는 예제
 *  import 구문으로 자바API사용
 */
import java.io.IOException;

public class Read01KeyCode {
	public static void main(String[] args) throws IOException {
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		
		
		
	}

}
