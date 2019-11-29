package academy.learnprogramming.queueschallenge;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
        // should return true
        System.out.println(checkForPalindrome("racecar"));
    }

    public static boolean checkForPalindrome(String input) {

        String transform = input.replaceAll("[^a-zA-Z]","");
        System.out.println("Transformed String : "+transform);
        char inputArr[] = transform.toCharArray();
        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();

        for(int i = 0; i< inputArr.length; i++){
            stack.push(inputArr[i]);
            queue.addLast(inputArr[i]);
        }

        StringBuilder poppedStr = new StringBuilder();
        StringBuilder dequeueStr = new StringBuilder();

        while (!(stack.isEmpty())){
            poppedStr.append(stack.pop());
            dequeueStr.append(queue.removeFirst());
        }

        System.out.println("Popped from Stack : "+poppedStr);
        System.out.println("Removed from Queue : "+dequeueStr);

        return poppedStr.toString().equalsIgnoreCase(dequeueStr.toString());
    }
}
