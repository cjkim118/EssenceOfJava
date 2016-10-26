package Ten;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.EventHandler;

/*
 * [10-4] 아래의 EventHandler를 익명 클래스(anonymous class)로 변경하시오.
 */
/*
public class Four {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new EventHandler()); }

}
class EventHandler extends WindowAdapter {
	public void windowClosing(WindowEvent e) { 
		e.getWindow().setVisible(false); 
		e.getWindow().dispose(); 
		System.exit(0);
} }

*/

public class Four{
	public static void main(String[] args){
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}});
		}
			
	}
