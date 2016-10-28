package Twelve;
/*
 * [12-5]다음의 코드를 실행한 결과를 예측하고, 직접 실행한 결과와 비교하라.
 * 		 만일 예측한 결과와 실행한 결과의 차이가 있다면 그 이유를 설명하라.
 * 
 * 예측결과 : 0123456789출력
 * 실제 결과: 
 * 	0
	1
	2
	3
	4
	Exception in thread "main" java.lang.Exception: Booooom!
		at Twelve.Five.main(Five.java:16)
	5
	6
	7
	8
	9
 * 
 * 이유 :쓰레드3과 메인쓰레드는 다른 호출스택 상에 있기 때문에 메인쓰레드에서 오류가 발생하여 종료되었다고 하더라도 쓰레드3에는 영향이 끼치지 않는다.
 *
 */
public class Five {
	public static void main(String[] args) throws Exception{
		Thread3 th1 = new Thread3();
		th1.start();
		try{
			Thread.sleep(5 * 1000);
		}catch(Exception e){}
		throw new Exception("Booooom!");
	}
}
class Thread3 extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
		
	}
}
