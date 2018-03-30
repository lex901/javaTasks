import java.util.Arrays;
public class task1{
	public static void main(String[] args) {
		if (args.length!=1)
			System.out.println("Wrong number of args ");
		else{
			try{
  				int num = Integer.parseInt(args[0]);
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
					 for (int i=0; i < primes.length; ++i){
						 if(primes[i])
							 System.out.println(i);
					 }						
				}
			}catch(NumberFormatException e){
					System.out.println("Wrong arg type");
			}
		}
	}
}