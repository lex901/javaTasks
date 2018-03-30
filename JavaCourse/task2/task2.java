import java.util.Scanner;
public class task2 {
 
    public static int fib(int n) {
        if (n <= 2)
		return 1;
        else
		return fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String[] args) {
        int count = 1;
		System.out.println("Please, input some number");
		Scanner sc = new Scanner(System.in);
		if (!sc.hasNextInt())
			System.out.println("Wrong type");
		else {
		int endPoint = sc.nextInt();
			if (endPoint<1)
				System.out.println("Too small number");
			else{
				System.out.println("Result: ");
				while (true) {
					int number = fib(count);
					if (number > endPoint)
						break;
					System.out.println(number);
					count++;
				}
			}
		}
	}
}