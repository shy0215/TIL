class Calculator{ //class
	int left, right; //�Ʒ��� this.left
	
	public void setOprands(int left, int right) {
		this.left = left; //�Ű������� left
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
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();
	}

}