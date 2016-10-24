package Eight;
/*
 * [8-1] 예외처리의 정의와 목적에 대해서 설명하시오.
 * 
 * 	정의 : 프로그램 실행시 발생할수 있는 미약한 오류를 대비해 작성하는 코드.
 *  목적 : 프로그램의 오작동을 막고 정삭적인 구동을 위함.
 *  
 *  정답 
 *  	정의 : 프로그 실행 시 발생할수 있는 예외의 상태에 대비하는 코드를 작성하는 것.
 *  	목적 : 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것.
 *  
 *  
 * [8-2] 다음은 실행도중 예외가 발생하여 화면에 출력된 내용이다. 이에 대한 설명 중 옳지 않은 것은?
 * java.lang.ArithmeticException : / by zero
 * 			at ExceptionEx18.method2(ExceptionEx18.java:12) 
 * 			at ExceptionEx18.method1(ExceptionEx18.java:8) 
 * 			at ExceptionEx18.main(ExceptionEx18.java:4)
 * 
 * a. 위의 내용으로 예외가 발생했을 당시 호출스택에 존재했던 메서드를 알 수 있다.
 * b. 예외가 발생한 위치는 method2 메서드이며, ExceptionEx18.java파일의 12번째 줄이다. 
 * c. 발생한 예외는 ArithmeticException이며, 0으로 나누어서 예외가 발생했다.
 * d. method2메서드가 method1메서드를 호출하였고 그 위치는 ExceptionEx18.java파일의 8 번째 줄이다.
 * 
 * 정답 : d
 * 이유 : 예외가 발생한 메서드는 method2이며 0을 나누어서 예외가 발생하였다.호출 스택에 근거하여
 * 		 main함수가 method1을 호출하였고 method1은 method2를 호출하였다.
 * 
 * [8-3] 다음 중 오버라이딩이 잘못된 것은? (모두 고르시오) 
 * void add(int a, int b) throws InvalidNumberException, NotANumberException {}
 * class NumberException extends Exception {}
 * class InvalidNumberException extends NumberException {} 
 * class NotANumberException extends NumberException {}
 * a. void add(int a, int b) throws InvalidNumberException, NotANumberException {} 
 * b. void add(int a, int b) throws InvalidNumberException {}
 * c. void add(int a, int b) throws NotANumberException {}
 * d. void add(int a, int b) throws Exception {}
 * e. void add(int a, int b) throws NumberException {}
 *
 * 정답 :a,b,c
 * 땡땡땡!!
 * 
 * 정답 : d,e
 * 오버라이딩을 할때에 조상클래스의 메서드보다 더 많은 수의 예외를 처리할 수 없다.(같아도 된다)
 * 오버라이딩과 오버로딩을 착각하지 말기.
 * 
 * [8-4] 다음과 같은 메서드가 있을 때, 예외를 잘못 처리한 것은? (모두 고르시오) 
 * void method() throws InvalidNumberException, NotANumberException {}
 * class NumberException extends RuntimeException {}
 * class InvalidNumberException extends NumberException {} 
 * class NotANumberException extends NumberException {}
 * a. try {method();} catch(Exception e) {}
 * b. try {method();} catch(NumberException e) {} catch(Exception e) {} 
 * c. try {method();} catch(Exception e) {} catch(NumberException e) {} 
 * d. try {method();} catch(InvalidNumberException e) {} catch(NotANumberException e) {} 
 * e. try {method();} catch(NumberException e) {}
 * f. try {method();} catch(RuntimeException e) {}
 * 
 * 정답 : c
 * 맞았다!!
 * 해설 : try블럭에서 예외를 찾아내면 catch블럭을 순서대로 수행한다.각 catch블럭에서 매개변수와 부합하는(isinstanceof) 인스턴스 변수를 찾을경우
 *       그 catch블럭을 수행하고 종료한다.그리하여 범위가 좁은것부터 시작하여 마지막에 제일큰 인스턴스를 처리해야 한다.
 */

public class OnetoFour {

}
