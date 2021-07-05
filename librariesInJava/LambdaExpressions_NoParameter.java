package librariesInJava;

interface Test1{
	void print();
}
public class LambdaExpressions_NoParameter {
	static void fun(Test1 t) {
		t.print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(() -> System.out.println("Hello"));
	}
}
