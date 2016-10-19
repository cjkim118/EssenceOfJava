package Six;
/*
 *  6-1문제로 생성한 클래스를 기반으로 기능을 보충한다.
 *  여기서 겪었던 소소한 문제는 : int를 String으로 전환시키는 과정에서
 *  					   toString을 int의 멤버 메소드로 착각해	
 *  					   result.toString()으로 작성해 오류가 났었다
 *  
 */
public class Two {
	public static void main(String args[]){
		SutdaCard card1 = new SutdaCard(3,false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
	
	
	
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1,true);
	}
	SutdaCard(int num,boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info(){
		return num + (isKwang ? "K" : "");
	}
}