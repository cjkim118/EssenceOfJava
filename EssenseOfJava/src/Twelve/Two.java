package Twelve;
/*
 * [12-2]다음 코드의 실행결과로 옳은 것은? 
 * a.01201233454567689789처럼 0부터 9까지의 숫자가 섞여서 출력된다.
 * b.01234567890123456789처럼 0부터 9까지의 숫자가 순서대로 출력된다.
 * c.IllegalTgreadStateException 이 발생한다.
 * 
 * 정답:b
 * 해설 : Thread2의 인스턴스를 생성시키긴 하였지만,start()가아닌 run()을 실행하였으므로 단순히 Thread2클래스의 메서드를
 * 		 실행시킨 것과 같은 결과를 초래한다.
 * setdemon은??설정 해주어야 한다고 하지 않았나???
 * run은 한 클래스의 메서드일뿐 새로운 쓰레드가 실행되는것이 아니다.
 * 
 */
public class Two {
	public static void main(String[] args){
		Thread2 t1 = new Thread2();
		t1.run();
		
		for(int i=0; i<10;i++)
			System.out.print(i);
	}
}

class Thread2 extends Thread{
	public void run(){
		for(int i=0; i<10;i++)
			System.out.print(i);
	}
}
