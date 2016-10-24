package Seven;
/*
 * [7-6] 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야 하는 이유는 무엇인 가?
 * 		이유 : 자식클래스가 부모클래스를 상속할때 그의 상당하는 멤버변수 및 멤버메소드만 상속을 받는다.
 * 			  하지만 부모클래스의 생성자는 상속되지 않기때문에 관련된 멤버변수는 초기화가 되지 않는다.
 * 			  이러한 이유 때문에 제일 먼저 부모클래스의 생성자를 호출해야 한다.
 * 
 * 		정답(해설) : 부모클래스에 정의된 인스턴스 변수들이 초기화되도록 하기 위해
 * 
 * [7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
 * 		생성자의 순서: Child()->Parent()->Parent(200)->Child(1000)
 * 		실행 결과: 1000
 * 
 * 		땡땡!! 틀렸다!!
 * 
 * 		정답:Child() -> Child(int x) -> Parent() -> Parent(int x) -> Object()
 * 		 *유념 해야 할 것 : 컴파일러는 생성자의 첫 줄에 다른 생성자를 호출하지 않으면 조상의 기본 생성자 를 호출하는 코드'super();'를 넣는다
 * 		실행결과 : 200
 * 			*getX는 부모클래스에서 파생되었으므로 부모클래스의 x가 반환된다.
 * 
 * [7-8] 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한 것은?
 * a. public-protected-(default)-private
 * b. public-(default)-protected-private 
 * c. (default)-public-protected-private 
 * d. private-protected-(default)-public
 * 
 *	정답 : A
 *
 * [7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다. 옳지 않은 것은? (모두 고르시오)
 * a. 지역변수 - 값을 변경할 수 없다.
 * b. 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다.
 * c. 메서드 - 오버로딩을 할 수 없다.
 * d. 멤버변수 - 값을 변경할 수 없다.
 * 
 * 정답 : C
 * 	메서드 : 변경될 수 없는 메서드, final로 지정된 메서드는 오버라이딩을 통해 재정의 될 수 없다.
 * 
 */
public class SixToNine {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x="+c.getX()); }
}
class Parent { 
	int x=100;
	Parent() {
		this(200); // Parent(int x)를 호출
	}
	Parent(int x) { 
		this.x = x;
	}
	int getX() { return x;} 
	}
class Child extends Parent { 
	int x = 3000;
	Child() {
		this(1000);	//Child(intx)를 호출
	}
	Child(int x) { 
		this.x = x;
	} 
}