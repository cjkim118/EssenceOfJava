package Twelve;

import java.util.Scanner;
import java.util.Vector;

/*
 * [12-9] 다음의 코드는 텍스트기반의 타자연습게임인데 
 * 		  WordGenerator라는 쓰레드가 Vector에 2초마다 단어를 하나씩 추가하고, 
 * 		  사용자가 단어를 입력하면 Vector에서 일치하 는 단어를 삭제하도록 되어 있다. 
 * 		  WordGenerator의 run()을 완성하시오.
 */
public class Nine {
	Vector words = new Vector();
	String[] data = {"태연","유리","윤아","효연","수영","서현","티파니","써니","제시카"};
	int interval = 2 * 1000; // 2초 
	WordGenerator wg = new WordGenerator();
	public static void main(String args[]) {
		Nine game = new Nine(); 
		game.wg.start(); // 단어를 생성하는 쓰레드를 실행시킨다. 
		Vector words = game.words;
		while(true) {
			System.out.println(words);
			String prompt = ">>"; 
			System.out.print(prompt);// 화면으로부터 라인단위로 입력받는다. 
			Scanner s = new Scanner(System.in); 
			String input = s.nextLine().trim();
			int index = words.indexOf(input); // 입력받은 단어를 words에서 찾는다.
			if(index!=-1) { // 찾으면
				words.remove(index); // words에서 해당 단어를 제거한다.
			} 
		}
	} // main
	class WordGenerator extends Thread { 
		public void run() {
			
			while(true){
			
				int random_index = (int) (Math.random() * data.length) ; 
				words.add(data[random_index]);
				try{
					Thread.sleep(interval);
				}catch(Exception e){}}
			
		}
	}
}
