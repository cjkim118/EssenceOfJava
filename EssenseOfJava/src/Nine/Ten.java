package Nine;
/*
 * [9-10] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 * 메서드명 : format
 * 기 능 : 주어진 문자열을 지정된 크기의 문자열로 변환한다. 나머지 공간은 공백으로 채운다. 반환타입 : String
 * 매개변수 : String str - 변환할 문자열
 * 			int length - 변환된 문자열의 길이
 * 			int alignment - 변환된 문자열의 정렬조건 (0:왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬)
 */
public class Ten {
	
	public static String format(String str,int length,int alignment){
		if(str == null || length <= 0 || alignment < 0 || alignment > 2)
			return null;
		if(length < str.length())
			return str.substring(0,length);
		char[] result = new char[length];
		switch(alignment){
		case 0:
			System.arraycopy(str.toCharArray(),0,result,0,str.length());
			for(int i=str.length(); i < length; i++)
				result[i] = ' ';
			break;
			
		case 1:
			int middle = length/2 - (str.length()/2) - 1;
			for(int i=0; i < middle; i++){
				result[i] = ' ';
			}
			System.arraycopy(str.toCharArray(), 0, result, middle, str.length());
			for(int i=middle + str.length(); i < length; i++)
				result[i] = ' ';
			break;
		case 2:
			for(int i=0; i < length - str.length(); i++){
				result[i] = ' ';
			}
			System.arraycopy(str.toCharArray(), 0, result, length-str.length() - 1, str.length());
			break;
		default:
			break;
		}
		return String.valueOf(result);
	}
	
/*
 *  먼저 배열을 " " 으로 채워놓고 그 후에 복사를 하면 중복 코드를 지울 수 있다.
 *  
 */
	public static void main(String[] args) { 
		String str = "가나다";
		System.out.println(format(str,7,0)); // 왼쪽 정렬 
		System.out.println(format(str,7,1)); // 가운데 정렬 
		System.out.println(format(str,7,2)); // 오른쪽 정렬
	}
}
