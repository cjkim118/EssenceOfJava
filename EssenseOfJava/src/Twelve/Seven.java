package Twelve;
/*
 * [12-7]다음의 코드는 쓰레드 th1을 생성해서 실행시킨 다음 6초 후에 정지시키는 코드이다.
 * 		 그러나 실제로 실행시켜보면 쓰레드를 정지시킨 다음에도 몇초가 지난 후에서야 멈춘다.
 *	 	 그 이유를 설명하고,쓰레드를 정지시키면 지체없이 바로 정지되도록 코드를 개선하시오.
 *
 *
 *	 이유 :6초 뒤에 stopped의 값이 true로 바뀌었다 할지라도 thread5의 sleep문에 의해 일시정지된 상태일 수 있다.
 * 		  그러한 이유때문에 지연이 발생하기 때문에 stopped = true뒤에 thread5를 깨우는 명령어를 실행하여 지연을 방지시킨다.
 */
public class Seven {
	static boolean stopped = false;
	public static void main(String[] args){
		Thread5 th1 = new Thread5();
		th1.start();
		try{
			Thread.sleep(6 * 1000);
		}catch(Exception e){}
		
		stopped = true;
		th1.interrupt();
		System.out.println("stopped");
	}
}

class Thread5 extends Thread{
	public void run(){
		for(int i=0; !Seven.stopped; i++){
			System.out.println(i);
			try{
				Thread.sleep(3 * 1000);
			}catch(Exception e){}
		}
	}
}