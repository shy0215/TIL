class Calculator{ //"static" keyword make -> "sum", "avg" methods called "class method"
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	
	public static void avg(int left, int right) {
		System.out.println((left + right)/2);
	}
}
public class CalculatorDemo2 {

	public static void main(String[] args) {
		//No instance
		Calculator.sum(10, 20);  
		Calculator.avg(10, 20);
	}
}

//////////////////////////////////////////////////////////////////////////////////////////
// Memo                                                                                 //
//- Ŭ���� �޼ҵ�                                                                           //
//- �ν��Ͻ� �޼ҵ�� Ŭ���� �ɹ��� ���� �� �� �ִ�.                                                 //
//- Ŭ���� �޼ҵ�� �ν��Ͻ� �ɹ��� ���� �� �� ����.                                                 //
//- �ν��Ͻ� ������ �ν��Ͻ��� ��������鼭 �����Ǵµ�, Ŭ���� �޼ҵ�� �ν��Ͻ��� �����Ǳ� ���� ��������� ������ Ŭ���� //
//  �޼ҵ尡 �ν��Ͻ� �ɹ��� �����ϴ� ���� �������� �ʴ� �ν��Ͻ� ������ �����ϴ� �Ͱ� ����.                     //
/////////////////////////////////////////////////////////////////////////////////////////