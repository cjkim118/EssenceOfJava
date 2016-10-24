package Seven;
/*
 * 7-1 섰다카드 20장을 포함하는 섰다카드 한벌(SutdaDeck Class)을 정의한 것이다.
 * 섯다카드 20장을 담는 SutdaCard배열을 초기화하시오.단 카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고,
 * 숫자가 1,3,8인 경우에는 둘중의 한장은 광이어야 한다.즉,SutdaCard의 인스턴스 변수 isKwang의 값이true여야 한다.
 * 
 * 
 * 
 * 7-2 문제 7-1의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
 * 
 * 1.메서드명 : shuffle
 *   기   능 :배열 cards에 담긴 카드의 위치를 뒤섞는
 *   반환타입 :없음 
 *   매개변수 :없음 
 *  
 * 2.메서드명 :pick
 *   기   능 :배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
 *   반환타입 :SutDaCard
 *   매개변수 :int index - 위치 
 *   
 * 3.메서드명 :pick
 *   기   능 :배열 cards에서 임의의 위치의 SutdaCard를 반환한다.
 *   반환타입 :SutdaCard
 *   매개변수 :없음 
 * 
 
 */
public class OneTwo {
	
	public static void main(String args[]){
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0;i < deck.cards.length;i++){
			System.out.println(deck.cards[i]+",");
		}
	}
}
class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck(){
		/* 
		 * (1) 배열 SutdaCard를 적절히 초기화 하시오.
		 */
		for(int i=0;i<CARD_NUM;i++){
			int index = (i+1 > 10) ? (i-10) : i;
			index = index + 1;
			boolean Kwang = (i == 1 || i == 3 || i == 8) && (index < 10) ? true : false;
			cards[i] = new SutdaCard(index,Kwang);
		}
	}
	
	/*
	 * (2) 위의 정의된 세 개의 메서드를 작성하시오.
	 */
	
	void shuffle(){
		for(int i=0; i < 20; i++){
			int swap_1 = (int)(Math.random() * 10) + 1;
			int swap_2 = (int)(Math.random() * 10) + 1;
			if(swap_1 == swap_2) i--;
			else{
				ChangeCard(swap_1,swap_2);
			}
		}
		
		
	}
	void ChangeCard(int index1,int index2){
		SutdaCard tmp_card = new SutdaCard();
		
		// better solution
		tmp_card = cards[index1];
		cards[index1] = cards[index2];
		cards[index2] = tmp_card;
		/*
		tmp_card.num = cards[index1].num;
		tmp_card.isKwang = cards[index1].isKwang;
		
		cards[index1].num = cards[index2].num;
		cards[index1].isKwang = cards[index2].isKwang;
		
		cards[index2].num = tmp_card.num;
		cards[index2].isKwang = tmp_card.isKwang;
		 */
		
	}
	SutdaCard pick(int index){
		
		//유효성 검사 꼭 하기!!
		if (index < 0 || index >= CARD_NUM)
			return null;
		return cards[index];
	}
	SutdaCard pick(){
		return cards[(int)Math.random()*CARD_NUM];
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
	
	//info()대신  Object클래스의  toString()을 오버라이딩 했다.
	public String toString(){
		return num + (isKwang ? "K" : "");
	}
}
