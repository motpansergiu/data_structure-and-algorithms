package datastructures.stack.problems.check_balanced_parentheses;

import datastructures.stack.Stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckBalancedExpression {

    private final Map<Character, Character> dictionary;

    private final Stack<Character> stack;

    /**
     * Expression can contain only -> "{}()[]"
     * @param stack
     */
    public CheckBalancedExpression(final Stack<Character> stack) {
        this.stack = stack;
        dictionary = new HashMap<>(3, 1.0f);

        dictionary.put('}', '{');
        dictionary.put(')', '(');
        dictionary.put(']', '[');
    }

    public CheckBalancedExpression(final Stack<Character> stack, final Map<Character, Character> dictionary) {
        this.stack = stack;
        this.dictionary = dictionary;
    }

    public boolean check(String expression) {

        char [] characters = expression.toCharArray();

        for (int i = 0; i < characters.length; ++i) {
            if (dictionary.containsKey(characters[i])) {
                char currentChar = stack.pop();
                if (currentChar != dictionary.get(characters[i])) {
                    return false;
                }
            } else {
                stack.push(characters[i]);
            }
        }

        return true;
    }

}
