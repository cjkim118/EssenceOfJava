package Six;
/*
 * 멤버변수를 활용,인스턴스 메서드를 작성하는 문제.
 */
class MyPoint{
	int x;
	int y;
	
	MyPoint(int x,int y){
		this.x = x;
		this.y = y;
	}
	/*
	 * 인스턴스메서드 getDistance를 작성하시오.
	 */
	
	double getDistance(int x1,int y1){
		double x_dis = Math.abs(this.x - x1);
		double y_dis = Math.abs(this.y - y1);
		x_dis = x_dis * x_dis;
		y_dis = y_dis * y_dis;
		return Math.sqrt(x_dis + y_dis);
	}
}
public class Seven {
	
	public static void main(String args[]){
		MyPoint p = new MyPoint(1,1);
		
		System.out.println(p.getDistance(2,2));
	}

}
