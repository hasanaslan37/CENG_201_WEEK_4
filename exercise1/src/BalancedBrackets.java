public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        BracketStack st = new BracketStack();

        for (int idx = 0; idx < s.length(); idx++) {
            char ch = s.charAt(idx);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) {
                    return false;
                }
                char topChar = st.pop();
                if (!isMatchingPair(topChar, ch)) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        if (opening == '(' && closing == ')') return true;
        if (opening == '[' && closing == ']') return true;
        if (opening == '{' && closing == '}') return true;
        return false;
    }
}