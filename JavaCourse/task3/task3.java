import java.awt.Point;
import java.util.Scanner;
public class task3{

public static int orientation(Point p, Point q, Point r) {
    double val = (q.getY() - p.getY()) * (r.getX() - q.getX())
            - (q.getX() - p.getX()) * (r.getY() - q.getY());

    if (val == 0.0)
        return 0; // colinear
    return (val > 0) ? 1 : 2; // clock or counterclock wise
}

public static boolean intersect(Point p1, Point q1, Point p2, Point q2) {

    int o1 = orientation(p1, q1, p2);
    int o2 = orientation(p1, q1, q2);
    int o3 = orientation(p2, q2, p1);
    int o4 = orientation(p2, q2, q1);

    if (o1 != o2 && o3 != o4)
        return true;

    return false;
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int[] vars = new int[8];

		for(int i = 0; i < vars.length; i++) {
			System.out.println("Enter next point data: ");
			if (!sc.hasNextInt())
			{
				System.out.println("Wrong type");
				return;
			}
			else 
				vars[i] = sc.nextInt();
		}
    Point p1 = new Point(vars[0],vars[1]);
    Point q1 = new Point(vars[2],vars[3]);
    Point p2 = new Point(vars[4],vars[5]);      
    Point q2 = new Point(vars[6],vars[7]);      
    System.out.println("intersect: "+intersect(p1, q1, p2, q2));
}
}