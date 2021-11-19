package Reverse;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        String input = "17236";

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        StringBuilder str = new StringBuilder();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            str.append(stack.pop());
        }
        System.out.println(str.toString());
    }
}

