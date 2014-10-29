import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class ExtractEmails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputtext = input.nextLine();
		Pattern patternemails = Pattern
				.compile("[[\\w+\\d+]*[.-_][\\w+\\d+]*]*@[[\\w+][-.]]*\\.\\w+");
		ArrayList<String> emailslist = new ArrayList<>();
		Matcher matcher = patternemails.matcher(inputtext);
		while (matcher.find()) {
			emailslist.add(matcher.group());
		}
		for (String email : emailslist) {
			System.out.println(email);
		}
		input.close();
	}
}
