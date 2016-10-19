package Six;

public class Twenty {
	
	
	
	/*
	 * shuffle 메서드를 작성하시오
	 * 
	 * 여기서 숫자가 1부터 시작해서 맨 처음에 i를 1로 설정 하고 0번째 원소를 제거하고
	 * 반환하려 했으나 비효율적인 이유 때문에 더 좋은 방법(곧바로 flag에 1을 빼기)
	 * 으로 효율을 높였다.
	 */
	
	static int[] shuffle(int[] original){
		if(original == null || original.length == 0)
			return original;
		///유효성 검사 잊지 말기!!
		boolean[] flag = new boolean[original.length];
		int[] result = new int[original.length];
		
		for(int i=0;i < original.length;i++){
			int tmp =(int) (Math.random() * original.length + 1);
			if(!flag[tmp-1]){
				result[i] = tmp;
				flag[tmp-1] = true;
			}
			else i--;
			
		}
		
		return result;
	}
	public static void main(String[] args){

		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
