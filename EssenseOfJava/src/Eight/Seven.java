package Eight;
/*
 * [8-7] 아래의 코드가 수행되었을 때의 실행결과를 적으시오.
 * 
 * 실행 결과: 1
 * 
 * 해설 : System.exit(0)은 정상 종료를 의미한다.이때는 프로그램이 종료되어 finally블럭도 실행하지 않는다.
 */
public class Seven {
	static void method(boolean b) {
		try { 
			System.out.println(1); 
			if(b) 
				System.exit(0); 
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
