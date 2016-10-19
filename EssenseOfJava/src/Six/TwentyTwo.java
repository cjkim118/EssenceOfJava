package Six;
/*
 * 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 *  
 * 
 * 메서드명 :isNumber
 * 기 능 :주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
 * 		 모두 숫자로만 이루어져 있으면 true를 반환하고,
 * 		 그렇지 않으면 false를 반환한다.
 * 		 만일 주어진 문자열이 null이거나 빈문자열“”이라면 false를 반환한다. 
 * 반환타입 :boolean
 * 매개변수 :String str - 검사할 문자열
 * 
 * 
 * 
 * 
 * 매 인덱스상의 문자가 숫자인지 아닌지 판별할 때 아스키 코드를 정확히 뭘라 고민을 하던 와중에,
 * 그냥 단순히 숫자만 판단 하면 되기 때문에 아스키 코드값을 정확히 알 필요가 없었다.
 */
public class TwentyTwo {
	/*
	 *  (1) isNumber메서드를 작성하시오
	 */
	
	static boolean isNumber(String str){
		if(str == null || str == "")
			return false;
		else{
			int i = 0;
			do{
				if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
					i++;
				}
				else return false;
			}while(i < str.length());
			return true;
		}
	}
	
	
	public static void main(String args[]){
		String str = "123";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		
		str = "1234o";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
	}

}
