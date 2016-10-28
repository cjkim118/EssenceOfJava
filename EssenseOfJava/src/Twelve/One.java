package Twelve;
/*
 * [12-1]쓰레드를 구현하는 방법에는 Thread클래스로부터 상속받는 것과 Runnable인터페이스를 구현하는 것 두가지가 있는데,다음의 코드는
 * Thread클래스를 상속받아서 쓰레드를 구현한 것이다.이 코드를 Runnable인터페이스로  구현하도록 변경하시오.
 *
 *
 *
 * [해설] runnable인터페이스를 이용하여 스레드를 구현할 경우,우선 runnable참조변수를 생성한 후 thread인스턴스를 생성한다,
 * 		 thread생성시 생성자에 runnable참조변수를 매개변수로 넘긴다.
public class One {
	public static void main(String[] args){
		Thread1 th1 = new Thread1();
		
		th1.start();
	}
}
class Thread1 extends Thread{
	public void run(){
		for(int i=0; i < 300; i++)
			System.out.print('-');
	}
}

*/

public class One{
	public static void main(String[] args){
		Runnable r = new Thread1();
		Thread th1 = new Thread(r);
		th1.start();
		
	}
}
class Thread1 implements Runnable{
	public void run(){
		for(int i=0;i < 300;i++)
			System.out.print('-');
	}
}