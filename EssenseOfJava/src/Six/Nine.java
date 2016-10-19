package Six;
/*
 *  static을 붙여아 하는것은 어떤 것들이고 그 이유는 무엇인가?
 *  (모든 병사의 공경력과 방어력은 같아야 한다)
 *  붙여야 하는 변수: weapon,armor weaponUp(),armorUp()
 *  			  위와 같은 요구사항에 따라 모든 병사들의 설정을 같게 하기 위해서.
 */

/*
 *  static 변수에 대해 작업을 할 경우 static메서드를 사
 */
public class Nine {
}

class Marine{
	int x=0,y=0;
	int hp = 60;
	int weapon = 6;
	int armor = 0;
	
	void weaponUp(){
		weapon++;
	}
	void armorUp(){
		armor++;
	}
	void move(int x,int y){
		this.x = x;
		this.y = y;
	}
}
