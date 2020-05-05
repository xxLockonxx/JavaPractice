package sub02;
/*
 * 날짜 : 2020/05/05
 * 이름 : 이성진 
 * 제목 : Java의 정석2판 문제풀기 2장
 */
public class JavaPracSampleQuest01 {
	public static void main(String[] args) {

		//2-2 
		Long regNo = 88004151111111L; // L 빠뜨려서 틀림.
		
		//2-3
		int i = 100;
		long l = 100L;
		final float PI = 3.14f;
		
		/* 리터럴 : 100, 100L, 3.14f
		*  변수 : i, l
		*  키워드 : int, long, final, float
		*  상수 : PI 앞에 final이 붙으면 상수로 선언 된다는 것 기억하자.
		*/
		
		/*2-4 
		Primitive type
		: boolean, byte, short, char, int, long, float, double
		  이렇게 총 8개 있다.
		*/
		
		//2-5 
		/*문자열과 덧셈연산을 하면항상 문자열
		 * 문자와 문자의 덧셈 연산은 int형 정수값
		 * 아스키코드로 생각하니까 알고 있어야함.
		 * '1'도 문자로 받아들임 ''가 있으니까
		 * '1'은 49번
		 * '2'는 50번
		 */
		System.out.println("1" + "2"); //12
		System.out.println(true + ""); //true
		System.out.println('A' + 'B'); //131
		System.out.println('1' +  2 ); //51
		System.out.println('1' +  '2' ); //99
		System.out.println('J' + "ava"); //Java
		// System.out.println(true + null); //오류
		
		//2-6 b,c 틀림
		/* 자바는 대소문자 구분. true는 키워드이지만 True는 키워드가아니다.
		 * 키워드가 뭔지 다시 알아야겠다.
		 */
		
		//2-7 b,c,f,h 있는 걸 골라야하는데 ㅋㅋ
		
		/*
		 * 1. 대소문자가 구분되며 길이 제한이 없다.
		 * 2. 예약어를 사용해서는 안 된다.
		 * 3. 숫자로 시작해서는 안 된다.
		 * 4. 특수문자는 '_'와 '$'만을 허용한다.
		 * */
		int $ystem; 
		int IF;
		int 자바;
		int $MAX_NUM;
		
		//2-8 b,c,d,e
		/*
		 * 참조형 변수는 4byte int float는 4byte 나머지는 8byte
		 * */
		
		//2-9 형변환??? (무슨말인지 모르겠음)
		
		//2-10 char타입에 왜 정수인지 모르겠음
		/*
		 * char는 2바이트 2*8=16비트 2의 16제곱개 = 65536개(0~65535)
		 * 
		 * */
		
		//2-11 a,b,c,d
		double d =1.4e3f; 
		/*double(8byte)에 float값(4byte)
		를 넣는 것이라 괜찮음 */
		
		
		
		//2-12 a,b
		/*
		 * 매개변수 args는 달라도 되서 괜찮음
		 * public static은 위치 바뀌어도 됨
		 * 
		 * */
		
		//2-13 b,c
		/*char에는 '|u0000'이 들어가짐
		 * */
		char a = '\u0000';
		
		
		
		
		
		
	}
}
