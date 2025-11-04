import java.util.Locale;

public class PracticeSet3 {
    public static void main(String[] args) {
        //Write a Java program to convert a string to lowercase.
        String str = "Aashish Kumar";
        String convertedString = str.toLowerCase(Locale.ROOT);
        System.out.println(convertedString);

        //Write a Java program to replace spaces with underscores.
        String underScores = str.replace(" " ,"_");
        System.out.println(underScores);

        //Write a Java program to fill in a letter template which looks like below:
        // letter = “Dear <|name|>, Thanks a lot”
        // Replace <|name|> with a string (some name)
        System.out.printf("letter = “Dear %s, Thanks a lot”\n",str);

        //Write a Java program to detect double and triple spaces in a string.
        String myString = "This string contains  double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Write a program to format the following letter using escape sequence characters.
        //Letter = “Dear Harry, This Java Course is nice. Thanks”
        System.out.println("“Dear Harry,\n\t This Java Course is nice. \nThanks”");
    }
}
