public class EquationReverser {

    public static String reverseEquation(String equation) {
        TokenStack stack = new TokenStack();
        int i = 0;
        int len = equation.length();

        while (i < len) {
            char curr = equation.charAt(i);

            if (Character.isDigit(curr)) {
                int start = i;
                while (i < len && Character.isDigit(equation.charAt(i))) {
                    i++;
                }
                stack.push(equation.substring(start, i));
            } else {
                stack.push(String.valueOf(curr));
                i++;
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}