class Calculator{ //class
	int left, right; //아래의 this.left
	
	public void setOprands(int left, int right) {
		this.left = left; //매개변수의 left
		this.right = right;
	}
	public void sum() { //메소드
		System.out.println(this.left + this.right);
	}
	public void avg() { //메소드
		System.out.println((this.left + this.right)/2);
	}
}

public class CalculatorDemo {
	//c1, c2 -> 인스턴스
	public static void main(String[] args) {
		Calculator c1 = new Calculator(); //new 연산자 -> 객체 생성
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();
	}

}