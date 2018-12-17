import java.util.Stack;

/*
 * Program to verify if the given array of expression has balanced parenthesis or not
 * Stack related program
 * Input : char array of parenthesis
 * Output: Yes if balanced and No
 */
public class BalancedParenthesis {

	public static void main(String[] args) {
		char exp[] = { '{', '(', ')', '}', ']' };
		if (areParenthesisBalanced(exp)) {
			System.out.println("Yes, parenthesis are balanced in the given input");
		} else {
			System.out.println("No, parenthesis are not balanced in the given input");
		}
		System.out.println("Test commit");
	}

	private static boolean areParenthesisBalanced(char[] exp) {
		Stack<Character> s = new Stack<Character>();

		for (char c : exp) {
			if (c == '{' || c == '(' || c == '[')
				s.push(c);
			if (c == '}' || c == ')' || c == ']') {
				if (s.isEmpty())
					return false;
				else if (!matchingPair((Character) s.pop(), c)) {
					return false;
				}
			}
		}
		if (s.isEmpty())
			return true;
		return false;
	}

	private static boolean matchingPair(char c1, char c2) {
		if (c1 == '{' && c2 == '}')
			return true;
		else if (c1 == '[' && c2 == ']')
			return true;
		else if (c1 == '(' && c2 == ')')
			return true;
		return false;
	}
}
