package sub02;
/*
 * ��¥ : 2020/05/05
 * �̸� : �̼��� 
 * ���� : Java�� ����2�� ����Ǯ�� 2��
 */
public class JavaPracSampleQuest01 {
	public static void main(String[] args) {

		//2-2 
		Long regNo = 88004151111111L; // L ���߷��� Ʋ��.
		
		//2-3
		int i = 100;
		long l = 100L;
		final float PI = 3.14f;
		
		/* ���ͷ� : 100, 100L, 3.14f
		*  ���� : i, l
		*  Ű���� : int, long, final, float
		*  ��� : PI �տ� final�� ������ ����� ���� �ȴٴ� �� �������.
		*/
		
		/*2-4 
		Primitive type
		: boolean, byte, short, char, int, long, float, double
		  �̷��� �� 8�� �ִ�.
		*/
		
		//2-5 
		/*���ڿ��� ���������� �ϸ��׻� ���ڿ�
		 * ���ڿ� ������ ���� ������ int�� ������
		 * �ƽ�Ű�ڵ�� �����ϴϱ� �˰� �־����.
		 * '1'�� ���ڷ� �޾Ƶ��� ''�� �����ϱ�
		 * '1'�� 49��
		 * '2'�� 50��
		 */
		System.out.println("1" + "2"); //12
		System.out.println(true + ""); //true
		System.out.println('A' + 'B'); //131
		System.out.println('1' +  2 ); //51
		System.out.println('1' +  '2' ); //99
		System.out.println('J' + "ava"); //Java
		// System.out.println(true + null); //����
		
		//2-6 b,c Ʋ��
		/* �ڹٴ� ��ҹ��� ����. true�� Ű���������� True�� Ű���尡�ƴϴ�.
		 * Ű���尡 ���� �ٽ� �˾ƾ߰ڴ�.
		 */
		
		//2-7 b,c,f,h �ִ� �� �����ϴµ� ����
		
		/*
		 * 1. ��ҹ��ڰ� ���еǸ� ���� ������ ����.
		 * 2. ���� ����ؼ��� �� �ȴ�.
		 * 3. ���ڷ� �����ؼ��� �� �ȴ�.
		 * 4. Ư�����ڴ� '_'�� '$'���� ����Ѵ�.
		 * */
		int $ystem; 
		int IF;
		int �ڹ�;
		int $MAX_NUM;
		
		//2-8 b,c,d,e
		/*
		 * ������ ������ 4byte int float�� 4byte �������� 8byte
		 * */
		
		//2-9 ����ȯ??? (���������� �𸣰���)
		
		//2-10 charŸ�Կ� �� �������� �𸣰���
		/*
		 * char�� 2����Ʈ 2*8=16��Ʈ 2�� 16������ = 65536��(0~65535)
		 * 
		 * */
		
		//2-11 a,b,c,d
		double d =1.4e3f; 
		/*double(8byte)�� float��(4byte)
		�� �ִ� ���̶� ������ */
		
		
		
		//2-12 a,b
		/*
		 * �Ű����� args�� �޶� �Ǽ� ������
		 * public static�� ��ġ �ٲ� ��
		 * 
		 * */
		
		//2-13 b,c
		/*char���� '|u0000'�� ����
		 * */
		char a = '\u0000';
		
		
		
		
		
		
	}
}
