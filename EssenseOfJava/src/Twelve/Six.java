package Twelve;
/*
 * [12-5]다음의 코드를 실행한 결과를 예측하고, 직접 실행한 결과와 비교하라.
 * 		 만일 예측한 결과와 실행한 결과의 차이가 있다면 그 이유를 설명하라.
 * 예측결과 : 01234
 * 
 * 이유: 쓰레드4를 데몬쓰레드로 설정해놨다.즉슨 일반쓰레드가 모두 종료되면 데몬쓰레드는 강제적으로 종료되어야 한다.(보조적인 역할을 수행하므로)
 * 		5초 뒤에 메인쓰레드가 오류가 남으로써 종료됨으로,보조역할을 하는 쓰레드4 역시 즉시 종료된다.
 * 		main쓰레드가 종료됨가 동시에 쓰레드4도 종료
 */
public class Six {
	public static void main(String[] args) throws Exception{
		Thread4 th1 = new Thread4();
		th1.setDaemon(true);
		th1.start();
		
		try{
			th1.sleep(5 * 1000);
		}catch(Exception e){}
		
		throw new Exception("Booooom!");
	}
}

class Thread4 extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println(i);
		
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}