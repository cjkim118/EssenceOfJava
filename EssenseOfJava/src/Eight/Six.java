package Eight;
/*
 * [8-6] 아래의 코드가 수행되었을 때의 실행결과를 적으시오.
 * 
 * 실행 결과: 345
 * 땡떙
 * 
 * 정답 : 35
 * 해설 : method2()에서 NullPointerException이 발생했는데, 이 예외를 처리해줄 try-catch블럭 이 없으므로 method2()는 종료되고, 
 * 		이를 호출한 method1()으로 되돌아갔는데 여기에는 try-catch블럭이 있긴 하지만 
 * 		NullPointerException을 처리해줄 catch블럭이 없으므로 method1()도 종료되고, 
 * 		이를 호출한 main메서드로 돌아간다. 이 때 finally블럭이 수행되어 '3'이 출력된다.
 * 
 * 		catch구문을 작성한 경우 예외가 발생했을시 그 이후의 명령어는 실행하지 않는
 */
public class Six {
	public static void main(String[] args) {
		try { 
			method1();
		} catch(Exception e) { 
			System.out.println(5);
		} 
	}
	static void method1() { 
		try {
			method2();
			System.out.println(1);
		} catch(ArithmeticException e) {
			System.out.println(2); 
		} finally {
			System.out.println(3); 
		}
		System.out.println(4); 
		} // method1()
		static void method2() {
			throw new NullPointerException();
		}
}
