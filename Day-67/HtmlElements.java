import java.util.regex.*;
import java.util.*;


public class HtmlElements {

  private static final Stack<String> stack = new Stack<>();

  private static String[] parseElements(String str) {
    return str
        .toLowerCase()
        .replaceAll(">[^<]+", ">")
        .replaceAll("([>])(?=[<])", "$1 ")
        .replaceAll(" +", " ")
        .trim().split(" ");
  }

  private static boolean isOpeningTag(String tag) {
    Pattern pattern = Pattern.compile("<[a-z]>|<[a-z][a-z1-9]+>");
    Matcher matcher = pattern.matcher(tag);
    return matcher.find();
  }

  private static boolean isClosingTag(String tag) {
    Pattern pattern = Pattern.compile("</[a-z]>|</[a-z][a-z1-9]+>");
    Matcher matcher = pattern.matcher(tag);
    return matcher.find();
  }

  private static String getTagValue(String tag) {
    return tag.replaceAll("[></]", "");
  }

  private static String stringChallenge(String str) {
    String[] parsedTags = parseElements(str);
    for (String tag : parsedTags) {
      if (isOpeningTag(tag)) {
        stack.push(tag);
      } else if (isClosingTag(tag) && !stack.isEmpty()) {
        if (getTagValue(stack.peek()).equals(getTagValue(tag))) {
          stack.pop();
        }
      }
    }
    return stack.isEmpty() ? "true" : getTagValue(stack.peek());
  }
  public static String removeChallengeToken(String str, String challengeToken) {
    for (char c : challengeToken.toCharArray()) {
        str = str.replace(String.valueOf(c).toLowerCase(), " ");
        str = str.replace(String.valueOf(c).toUpperCase(), " ");
    }
    str = str.replaceAll(" ","");
    return str.isEmpty() ? "EMPTY" : str;
}


  public static void main(String[] args) {
    String result1 = stringChallenge("<div><div><b></b></div></p>");
    System.out.println(removeChallengeToken(result1,"08r5nvg2d9"));
    String result2 = stringChallenge("<div>abc</div><p><em><i>test test test</b>");
    System.out.println(removeChallengeToken(result2,"08r5nvg2d9"));
  }

}
