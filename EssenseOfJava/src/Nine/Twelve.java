package Nine;
/*
 * [9-12] 다음과 같이 정의된 메서드를 작성하고 테스트하시오. 
 * 			[주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
 * 메서드명 : getRand
 * 기 능 : 주어진 범위(from~to)에 속한 임의의 정수값을 반환한다.(양쪽 경계값 모두 범위에 포함)
 * 		  from의 값이 to의 값보다 클 경우도 처리되어야 한다.
 * 반환타입 : int
 * 매개변수 : int from - 범위의 시작값
 * 		    int to - 범위의 끝값

 */
public class Twelve {
	/*
	(1) getRand메서드를 작성하시오. 
	*/
	public static int getRand(int from,int to){
		int minus_value = (from > to) ? (from - to ) : (to - from); // Math.abs(from,to)
		
		int real_from = (from > to) ? to : from; // Math.min(to,from)
		int random = (int) Math.round((Math.random() * minus_value)) + real_from;
		return random;
	}
	public static void main(String[] args) {
		for(int i=0; i< 20; i++) 
			System.out.print(getRand(1,-3)+",");
		}
}
