package Six;
/*
 *  클래스메서드의 의미를 다시 잡고 Math클래스를 잘 활용해야 하는 문제이다.
 */
public class Six {
	static double getDistance(int x,int y,int x1,int y1){
		double x_dis = Math.abs(x - x1);
		double y_dis = Math.abs(y - y1);
		x_dis = x_dis * x_dis;
		y_dis = y_dis * y_dis;
		return Math.sqrt(x_dis + y_dis);
		
	}
	public static void main(String args[]){
		System.out.println(getDistance(1,1,2,2));
	}
}
