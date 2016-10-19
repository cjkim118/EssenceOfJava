package Six;
/* 6-18
 *  A:static변수는 인스턴스변수관련 작업을 할 수 없다 아래도 그와 같은 논리이다.
 *  B:
 *  D:
 */
public class EighteentoNineteen {

}
class MemberCall { 
	int iv=10; 
	static int cv = 20;

	int iv2 = cv;
	static int cv2 = iv;					//Line A
	static void staticMethod1() { 
		System.out.println(cv); 
		System.out.println(iv);				//Line B
	}
	void instanceMethod1() { 
		System.out.println(cv); 
		System.out.println(iv);				//Line C
	}

	static void staticMethod2() { 
		staticMethod1();
		instanceMethod1();					//Line D
	}

	void instanceMethod2() {
		staticMethod1(); 					//Line E
		instanceMethod1(); 
		}
}


/*
 * 6-19 코드 실행결과 예측하
 * 결과: ABC123456
 * String은 참조변수이기때문에 값이 바뀐다.
 * 
 * 
 * 위의 답은 내가 생각해낸 것이고 정확하지 않은 답이다.
 * 결과는 "ABC123"이다.
 * 문자열은 내용을 변경할수 없기때문에 덧셈 연산을 하면 새로운 문자열이 생성되고
 * 새로운 문자열의 주소가 변수 str에 저장된다.
 */
class Exercise6_19 {
	public static void change(String str) { 
		str += "456";
	}
	public static void main(String[] args) {
		String str = "ABC123"; 
		System.out.println(str);
		change(str);
		System.out.println("After change:"+str);
	} 
	}