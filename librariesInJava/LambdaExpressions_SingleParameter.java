package librariesInJava;

interface Test2{
	void print(Integer p);
}
public class LambdaExpressions_SingleParameter {
	static void fun(Test2 t,Integer p) {
		t.print(p);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(p-> System.out.println(p),10);
	}

}
