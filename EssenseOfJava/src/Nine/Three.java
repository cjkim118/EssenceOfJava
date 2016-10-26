package Nine;
/*
 * [9-3] 다음과 같은 실행결과가 나오도록 코드를 완성하시오.
 * 
 * 
 * [실행결과]
 * fullPath:c:\jdk1.5\work\PathSeparateTest.java 
 * path:c:\jdk1.5\work 
 * fileName:PathSeparateTest.java
 * 
 * 
 * 
 * 
 * 
 * IndexO 보다는 lastIndexOf가 훨씬 낫다.
 * 효율성울 생각하자!!
 */

public class Three {
	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java"; 
		String path = "";
		String fileName = "";
		/*
		(1) 알맞은 코드를 넣어 완성하시오. 
		*/
		int last_index = 0;
		int index = 0;
		for(int i=0; i < fullPath.length();i++){
			last_index = index;
			if(fullPath.contains("\\")){
				index = fullPath.indexOf("\\");
				path += fullPath.substring(last_index, index);
				
			}
				
		}
		fileName = fullPath.substring(index+1);
		
		System.out.println("fullPath:"+fullPath); 
		System.out.println("path:"+path); 
		System.out.println("fileName:"+fileName);
		}
}
