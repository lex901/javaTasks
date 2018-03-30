import java.util.Scanner;
public class task5 {
	public static boolean isPalindrome(String text) {
    return text.replaceAll("\\W","")
               .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W",""))
               .reverse().toString());
}
 public static void main(String[] args) {
		System.out.println("Please, input some text");
		Scanner sc = new Scanner(System.in);
		String rawText = sc.nextLine();
		if(isPalindrome(rawText))
			System.out.println("This is palindrome");
		else
			System.out.println("This is not palindrome");
		}
}