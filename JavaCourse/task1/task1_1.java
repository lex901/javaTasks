import java.util.Arrays;
import java.util.Scanner;
public class task1_1{
	public static void main(String[] args) {
			System.out.println("Please, input some number");
			Scanner sc = new Scanner(System.in);
			
			if (!sc.hasNextInt())
				System.out.println("Wrong type");
			else {
				int num = sc.nextInt();
			if (num<2)
				System.out.println("Too small number");
			else{
				boolean[] primes = new boolean[num + 1];
				 Arrays.fill(primes, true);
				 primes[0] = primes[1] = false;
				 for (int i = 2; i < primes.length; ++i) {
					 if (primes[i]) {
						 for (int j = 2; i * j < primes.length; ++j) {
						 primes[i * j] = false;
						 }
					 }
				 }
				 System.out.println("Result: ");
				 for (int i=0; i < primes.length; ++i){
					 if(primes[i])
						 System.out.println(i);
				 }						
			}
			}
		}
}