package librariesInJava;

interface Test3{
	void print(Integer p1,Integer p2);
}
public class LambdaExpressions_MultiParameter {
	static void fun(Test3 t,Integer p1,Integer p2) {
		t.print(p1, p2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun((p1,p2) -> System.out.print(p1+" "+p2),10,20);
	}
}
