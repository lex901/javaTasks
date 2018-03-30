import java.util.Scanner;
public class task4 {
 public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
		int[] vars = new int[2];

		for(int i = 0; i < vars.length; i++) {
			System.out.println("Enter next var: ");
			if (!sc.hasNextInt())
			{
				System.out.println("Wrong type");
				return;
			}
			else 
				vars[i] = sc.nextInt();
		}
				System.out.println("NOD");
				System.out.println(nod(vars[0],vars[1]));
				System.out.println("NOK");
				System.out.println(nok(vars[0],vars[1]));
			}
			
static int nod(int a,int b){
	if (a < 0 || b < 0) 
        throw new IllegalArgumentException();
	else
		return b == 0 ? a : nod(b,a % b);		
}
static int nok(int a,int b){
	if (a < 0 || b < 0) 
        throw new IllegalArgumentException();
	else
		return a / nod(a,b) * b;
}
}