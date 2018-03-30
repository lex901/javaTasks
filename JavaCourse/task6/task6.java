import java.util.Scanner;
public class task6 {
 public static void main(String[] args) {
		System.out.println("Please, input some text");
		Scanner sc = new Scanner(System.in);
		String rawText = sc.nextLine();
		String result = rawText.replaceAll("\\d", "");
		System.out.println("Result: "+result);
		}
}