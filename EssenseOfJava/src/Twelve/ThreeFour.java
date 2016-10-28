package Twelve;
/*
 * [12-3]다음 중 쓰레드를 일시정지 상태(WAITING)으로 만드는 것이 아닌 것은?(모두 고르시오)
 * a.suspend()
 * b.resume()
 * c.join()
 * d.sleep()
 * e.wait()
 * f.notify()
 * 
 * 정답 : c,f
 * 땡떙땡!!
 * 정답은 b와 f이다.
 * 해설: resume()은 suspend()의 호출로 인해 일시정지 상태가 된 쓰레드를 실행대기상태 로 바꿔준다. 
 * 		notify()역시 wait()의 호출로 인해 일시정지 상태가 된 쓰레드를 다시 실행대기 상태로 바꿔준다. 
 * 		join()은 현재 실행 중인 쓰레드를 멈추고 다른 쓰레드가 실행 되도록 한다.
 * 
 * [12-4]다음 중 interrupt()에 의해서 실행대기 상태(RUNNABLE)가 되지 않는 경우는?(모두 고르시오)
 * a.sleep()에 의해서 일시정지 상태인 쓰레드
 * b.join()에 의해서 일시정지 상태인 쓰레드
 * c.wait()에 의해서 일시정지 상태인 쓰레드
 * d.suspend()에 의해서 일시정지 상태인 쓰레드
 * 
 * 
 * 정답 : d
 * 해설: suspend()를 제외한 나머지 메서드들은 interrupt()가 호출되면 
 * 	    InterruptedException이 발생하여 일시정지 상태에서 벗어나 실행대기 상태가 된다.
 * 		(try-catch문으로 InterruptedException을 처리해주어야 한다.)
 * 
 */
public class ThreeFour {

}
