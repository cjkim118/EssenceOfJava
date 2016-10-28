package Twelve;
/*
 * [12-8]다음의 코드는 '-'를 출력하는 쓰레드와 '|'를 출력하는 쓰레드를 생성해서 실행시킨다.
 * 	 	 이 두개의 쓰레드가 실행결과처럼 '-'와 '|'를 한 번씩 번갈아가며 찍게 하려면 아래의 코드를 어떻게 변경해야 하는가?
 * 
 * 해설 ; 뒤에yield() 를 붙이면 된다고는 하는데 내 컴퓨터에서는 순서대로 출력되지 않는다..무슨 문제일까ㅠ
 */
public class Eight {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException{
		Thread6_1 th1 = new Thread6_1();
		Thread6_2 th2 = new Thread6_2();
		
		th1.start();
		th2.start();
	}
}
class Thread6_1 extends Thread{
	public void run(){
		for (int i=0;i < 300; i++){
			System.out.print('-');
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				yield();
		}
	}
}
class Thread6_2 extends Thread{
	public void run(){
		for(int i=0; i<300; i++){
			System.out.print('|');
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				yield();
		}
	}
}
