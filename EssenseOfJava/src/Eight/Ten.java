package Eight;
/*
 * [8-10] 아래의 코드가 수행되었을 때의 실행결과를 적으시오.
 * 실행 결과 : 2347
 * 
 * 땡떙..
 * 정답 : 247
 * 
 * 라인 30에서 예외를 다시 발생시킨다. 예외 되던지기(re-throwing)를 실시함으로써 
 * 전의 예외를 처리 후 예외를 다 발생시킨다. 
 * 
 * 
 */

public class Ten {
	public static void main(String[] args) {
		try { 
			method1();
			System.out.println(6); 
		} catch(Exception e) {
			System.out.println(7); 
		}
	}
	
	static void method1() throws Exception { 
		try {
			method2();
			System.out.println(1);
		} catch(NullPointerException e) {
			System.out.println(2);
			throw e; // 예외 내던지기 
		} catch(Exception e) {
			System.out.println(3); 
		} finally {
			System.out.println(4);
		}
		System.out.println(5); 
	} // method1()
	
	static void method2() {
		throw new NullPointerException();
	}
}
