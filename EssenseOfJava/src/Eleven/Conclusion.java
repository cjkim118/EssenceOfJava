package Eleven;

import java.util.HashSet;
import java.util.Set;

/*
 * Hashset : 중복된 요소를 저장하지 않음,이러한 특징을 이용하면 컬렉션 내의 중복된 요소들을 쉽게 제거 가능함.
 * 			 저장순서를 유지하지 않음. 유지하고자 하면 LinkedashSet을 이용해야함.
 * Collections.sort(List list)
 * TreeSet : 부모노드의 왼쪽은 부모노드의 값보다 작음,부모노드의 오른쪽 자식 노드는 부모노드의 값보다 큼.
 * 			 노드의 추가 삭제에 시간이 걸린다.
 * 			 검색과 정렬에 유리하다.
 * 
 * 
 * 
 * Calendar : 인스턴스를 생성하지 않고 메서드를 통해 완전히 구현된 클래스의 인스턴스를 얻는다.
 * 				 (최소한의 변경으로 프로그램이 동작할 수 있도록 하기 위한 것)
 */
public class Conclusion {
	public static void main(String[] args){
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();
		
		for(int i=0; i < objArr.length;i++){
			set.add(objArr[i]);
		}
		System.out.println(set);
	}
}
