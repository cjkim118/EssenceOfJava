package Six;
/*
 *  클래스의 기본기를 다질 수 있는 문제다.
 *  문제에서 요구하는경우는 소숫점 한자리까지만 표기하는 것이기 때문에
 *  Math클래스의 메서드를 이용하여 반올림을 한 후 다시 10을 나누어주었다
 *  여기서 주의할 점은 /10F를 해야 한다는 것이다.
 *  반올림 후 나오는 결과와 10 모두 int형식이기 때문에
 *  최종 결과값이 int형변환한 결과로 나오기 때문이다.
 */
public class ThreetoFive {
	public static void main(String args[]){
		Student a = new Student();
		a.name = "홍길동";
	a.ban = 1;
	a.no = 1;
	a.kor = 100;
	a.eng = 60;
	a.math = 76;
	
	System.out.println("이름:"+a.name);
	System.out.println("총점"+a.getTotal());
	System.out.println("평균"+a.getAverage());
	}
}
class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	Student(){
		this("NULL", 0, 0, 0, 0, 0);
	}
	Student(String name,int ban,int no,int kor,int eng,int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	int getTotal(){
		return kor+eng+math;
	}
	float getAverage(){
		float result = (float)getTotal()/3;
		return Math.round(result * 10) / 10F;
	}
	
	String info(){
		return name + "," + ban + "," + no + ","
				+ kor + "," + eng + "," + math + ","
				+ getTotal() + "," + getAverage();
	}
}