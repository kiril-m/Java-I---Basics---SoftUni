import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CountAllWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		Pattern words = Pattern.compile("\\w+");
		Matcher matcher = words.matcher(text);
		int count = 0;
		while (matcher.find()) {
			count++;
			
			
		}
		System.out.println(count);
		input.close();
	}

}
