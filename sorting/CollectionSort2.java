package sorting;
import java.util.*;

//class Point{
//	int x,y;
//	Point(int i,int j){
//		x=i;
//		y=j;
//	}
//}
public class CollectionSort2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Point> a = new ArrayList<Point>();
		a.add(new Point(10,20));
		a.add(new Point(3,12));
		a.add(new Point(5,7));
		Collections.sort(a, new MySort());
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i).x+  "" +a.get(i).y);
	}
}


