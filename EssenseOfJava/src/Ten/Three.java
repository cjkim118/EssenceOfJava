package Ten;
/*
 * [10-3] 다음과 같은 실행결과를 얻도록 (1)~(4)의 코드를 완성하시오.
 * [실행결과]
 * 30
 * 20
 * 10
 */
public class Three {
	public static void main(String args[]) {
		/*
		(4) 알맞은 코드를 넣어 완성하시오. */
		
		
		Outers outer = new Outers();
		Outers.Inner inner = outer.new Inner();
		
		inner.method1(); 
		}

}
class Outers { 
	int value=10;
	class Inner {
		int value=20;
		void method1() { 
			int value=30;
			System.out.println(/* (1) */
					value); 
			System.out.println(/* (2) */
					this.value); 
			System.out.println(/* (3) */Outers.this.value);
		}
	} // Inner클래스의 끝
} // Outer클래스의 끝
