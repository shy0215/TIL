class Calculator{ //class
	static double PI = 3.14;// static -> Ŭ������ ������ ��� �޼ҵ�,  �ν��Ͻ����� ��밡��
	int left, right; //�Ʒ��� this.left
	
	public void setOprands(int left, int right) {
		this.left = left; //�Ű������� left�� �ν��Ͻ��� ������ ����  
		this.right = right;
	}
	public void sum() { //�޼ҵ�
		System.out.println(this.left + this.right);
	}
	public void avg() { //�޼ҵ�
		System.out.println((this.left + this.right)/2);
	}
}

public class CalculatorDemo {
	//c1, c2 -> �ν��Ͻ�
	public static void main(String[] args) {
		Calculator c1 = new Calculator(); //new ������ -> ��ü ����
		c1.setOprands(10, 20); //�޼ҵ� ȣ��
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);//�ν��Ͻ��� ���ؼ� ����
		
		System.out.println(Calculator.PI);//Ŭ������ ���ؼ� ����
	}
}
//////////////////////////////////////////////////////////////////////////////////////////
// Memo                                                                                 //
// - ��ü�� ������ �޼ҵ��� ����                                                                //
// - Ŭ���� ������ �ν��Ͻ��� ������ �ʿ䰡 ���� ���� Ŭ������ �����ϰ� ���� ���, ���� ���� ������ ��� �ν��Ͻ���    //
//   �����ؾ��ϴ� ���, �ν��Ͻ��� ���� ������ �ʴ� ���� �ʿ��� ��� ���
//////////////////////////////////////////////////////////////////////////////////////////