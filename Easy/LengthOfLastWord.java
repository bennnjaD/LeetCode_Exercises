package Easy;

public class LengthOfLastWord {
    /* Given a string *s* consisting of some words separated by
    some numbers of spaces, return the length of the last word in
    the string

    A word is a maximal substring consisting of non-space characters only

    Example:
    Input: s = "Hello World"

    Output: 5
    Because the las word is "World"
     */

    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
            length++;
        }

        return length;
    }

}
