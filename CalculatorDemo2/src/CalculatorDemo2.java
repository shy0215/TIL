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
//- 클래스 메소드                                                                           //
//- 인스턴스 메소드는 클래스 맴버에 접근 할 수 있다.                                                 //
//- 클래스 메소드는 인스턴스 맴버에 접근 할 수 없다.                                                 //
//- 인스턴스 변수는 인스턴스가 만들어지면서 생성되는데, 클래스 메소드는 인스턴스가 생성되기 전에 만들어지기 때문에 클래스 //
//  메소드가 인스턴스 맴버에 접근하는 것은 존재하지 않는 인스턴스 변수에 접근하는 것과 같다.                     //
/////////////////////////////////////////////////////////////////////////////////////////