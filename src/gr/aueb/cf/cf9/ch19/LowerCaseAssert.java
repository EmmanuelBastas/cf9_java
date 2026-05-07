package gr.aueb.cf.cf9.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LowerCaseAssert {

    public static void main(String[] args) {
        String s = "ADFAGASDGFASDFa";         // at least 8 characters, at least one in lower case

        Pattern pattern = Pattern.compile("(?=.*?[a-z])^.{8,}$");      // Zero-length assertion
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
