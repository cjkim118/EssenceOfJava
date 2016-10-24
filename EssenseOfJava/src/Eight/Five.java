package Eight;
/*
 * [8-5] 아래의 코드가 수행되었을 때의 실행결과를 적으시오.
 * 
 * 실행 결과: 1351256
 * 
 * 해설 : ArithmeticException은 RuntimeException의 자손 클래스 이기 때문에 3을 출력,
 * 		 return을 하면 메서드가 종료되지만 finally는 return과 관계없이 실행된다.
 * 		
 */
public class Five {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) 
				throw new ArithmeticException(); 
			System.out.println(2);
		} catch(RuntimeException r) { 
			System.out.println(3); 
			return;
		} catch(Exception e) { 
			System.out.println(4); 
			return;
		} finally { 
			System.out.println(5);
		}
		System.out.println(6); 
	}
	
	public static void main(String[] args) { 
		method(true);
		method(false); 
	} // main
}
