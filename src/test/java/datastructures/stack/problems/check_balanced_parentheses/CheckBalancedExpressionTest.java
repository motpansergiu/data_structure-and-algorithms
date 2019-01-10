package datastructures.stack.problems.check_balanced_parentheses;

import datastructures.stack.impl.NodeStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckBalancedExpressionTest {

    private CheckBalancedExpression checkBalancedExpression;
    private Map<Character, Character> dictionary;

    @BeforeEach
    public void init() {
        checkBalancedExpression = new CheckBalancedExpression(new NodeStack<>());
    }

    @Test
    void checkTrue() {

        String expression = "([[[(){({})}]]])";

        assertTrue(checkBalancedExpression.check(expression));

    }

    @Test
    void checkFalse() {

        String expression = "([[[()({({})}]]])";

        assertFalse(checkBalancedExpression.check(expression));

    }

    @Test
    void checkWithCustomDictionaryTrue() {
        dictionary = new HashMap<>();
        dictionary.put('}', '{');
        dictionary.put(')', '(');
        dictionary.put('!', '?');
        checkBalancedExpression = new CheckBalancedExpression(new NodeStack<>(), dictionary);

        String expression = "{()(?{}!)}";

        assertTrue(checkBalancedExpression.check(expression));

    }

    @Test
    void checkWithCustomDictionaryFalse() {
        dictionary = new HashMap<>();
        dictionary.put('}', '{');
        dictionary.put(')', '(');
        dictionary.put('!', '?');
        checkBalancedExpression = new CheckBalancedExpression(new NodeStack<>(), dictionary);

        String expression = "{()(?{})}";

        assertFalse(checkBalancedExpression.check(expression));

    }
}