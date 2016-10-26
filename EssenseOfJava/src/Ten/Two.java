package Ten;
/*
 * [10-2] Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.
 */
public class Two {
	public static void main(String[] args) {
		/*
		(1) 알맞은 코드를 넣어 완성하시오. */
		Outer.Inner inner = new Outer.Inner(); // static내부클래스는 외부클래스를 먼저 생성하지 않아도 
		
		System.out.println(inner.iv);
		}
	
}
class Outer {
	static class Inner {
		int iv=200; 
	}
}