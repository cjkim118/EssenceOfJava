package Eleven;

import java.util.*;

/*
 * [11-2] 다음 코드의 실행결과를 적으시오.
 * [실행결과]7632
 * 
 * 해설:
 * list = [3,6,2,2,7]
 * Hashset -> hash는 중복데이터는 저장이 불가하다.결과적으로 [3,6,2,7]이 저장된다. 
 *  hashset은 저장순서가 유지가 되지 않는다!정확히 [3,6,2,7]순으로 저장되는게 아니라 그 데이터들이 저장된다는 뜻이다.
 * Treeset -> treeset은 오름차순으로 저장된다. 결과적으로 [2,3,6,7]이 저장된다.
 * stack -> FILO,LIFO 원리로 먼저 push한게 마지막으로 pop된다.
 */
public class Two {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		HashSet set = new HashSet(list); 
		TreeSet tset = new TreeSet(set); 
		Stack stack = new Stack(); 
		stack.addAll(tset);
		while(!stack.empty()) 
			System.out.println(stack.pop());
		}
}
