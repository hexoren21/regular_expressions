import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2
{
    static Scanner scaner = new Scanner(System.in);
    public static String getScanner() {return scaner.nextLine();}
    public static void main(String args[])
    {
//        Pattern pattern = Pattern.compile("([0-9]{1,4}\\.){1}([0-9]\\.){1}([0-2]{1}[0-9]{1}){1}|" +
//                                                  "([0-9]{1,4}\\.){1}(1{1}[0-2]{1}\\.){1}([0-2]{1}[0-9]{1}){1}|" +
//                                                  "([0-9]{1,4}\\.){1}([0-9]\\.){1}(3{1}[0-1]{1})|" +
//                                                  "([0-9]{1,4}\\.){1}(1{1}[0-2]{1}\\.){1}(3{1}[0-1]{1})");
        Pattern pattern = Pattern.compile("(\\d{1,4}\\.){1}(\\d\\.){1}([0-2]{1}\\d{1}){1}|" +
                                                  "(\\d{1,4}\\.){1}(1{1}[0-2]{1}\\.){1}([0-2]{1}\\d{1}){1}|" +
                                                  "(\\d{1,4}\\.){1}(\\d\\.){1}(3{1}[0-1]{1})|" +
                                                  "(\\d{1,4}\\.){1}(1{1}[0-2]{1}\\.){1}(3{1}[0-1]{1})");

       // Pattern pattern = Pattern.compile("([0-9]{1,3}\\.){3}[0-9]{1,3}");
        Matcher matcher;
        while(true)
        {
            System.out.println("podaj dane");
            String a = getScanner();
            matcher = pattern.matcher(a);
            System.out.println(matcher.matches());
        }
    }
}
