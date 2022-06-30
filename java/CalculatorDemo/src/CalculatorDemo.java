class Calculator{ //class
	static double PI = 3.14;// static -> 클래스의 변수고 모든 메소드,  인스턴스에서 사용가능
	int left, right; //아래의 this.left
	
	public void setOprands(int left, int right) {
		this.left = left; //매개변수의 left를 인스턴스의 변수로 지정  
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
		c1.setOprands(10, 20); //메소드 호출
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);//인스턴스를 통해서 접근
		
		System.out.println(Calculator.PI);//클래스를 통해서 접근
	}
}
//////////////////////////////////////////////////////////////////////////////////////////
// Memo                                                                                 //
// - 객체는 변수와 메소드의 집합                                                                //
// - 클래스 변수는 인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우, 갑의 변경 사항을 모든 인스턴스가    //
//   공유해야하는 경우, 인스턴스에 따라서 변하지 않는 값이 필요한 경우 사용
//////////////////////////////////////////////////////////////////////////////////////////