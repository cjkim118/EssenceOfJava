package Nine;
/*
 * [9-11] 커맨드라인으로 2~9사이의 두 개의 숫자를 받아서 두 숫자사이의 구구단을 출력 하는 프로그램을 작성하시오.
		  예를 들어 3과 5를 입력하면 3단부터 5단까지 출력한다.
 * [실행결과]
		C:\jdk1.5\work\ch9>java Exercise9_11 2 
		시작 단과 끝 단, 두 개의 정수를 입력해주세요. 
		USAGE : GugudanTest 3 5
		C:\jdk1.5\work\ch9>java Exercise9_11 1 5 
		단의 범위는 2와 9사이의 값이어야 합니다. 
		USAGE : GugudanTest 3 5
		C:\jdk1.5\work\ch9>java Exercise9_11 3 5 
		3*1=3
		3*2=6
		3*3=9
		3*4=12
		3*5=15
		3*6=18
		3*7=21
		3*8=24
		3*9=27

 */
public class Eleven {
	public static boolean parameterTest(int i1,int i2){
		if(i1 > 1 && i1 < 9)
			if(i2 > 1 && i2 < 9)
				return true;
		return false;
		
	}
	public static void GugudanTest(int i1,int i2){
		int bigger = (i1 > i2) ? i1 : i2;
		int smaller = (i1 < i2) ? i1 : i2;
		for(int i=smaller; i <= bigger; i++)
			for(int j=1; j < 10; j++)
				System.out.println(i + "*" + j + "=" + i*j);
	}
	public static void main(String[] args){
		if(args.length != 2){
			System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요. ");
			System.out.println("USAGE : GugudanTest 3 5");
			System.exit(0);
		}
		if(!parameterTest(Integer.parseInt(args[0]),Integer.parseInt(args[1]))){
			System.out.println("단의 범위는 2와 9사이의 값이어야 합니다.");
			System.out.println("USAGE : GugudanTest 3 5");
			System.exit(0);
		}
		GugudanTest(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	}

}
