package String;

import java.util.Arrays;

public class reverseWord {
    public static void main(String args[]) {
        String s = "The sky is blue";
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String s) {
        String[] newString = s.trim().split("\\s+");
        System.out.println(Arrays.toString(newString));
        int start = 0;
        int end = newString.length - 1;
        while (start <= end) {
            swap(newString, start, end);
            start++;
            end--;
        }

        String result = String.join(" ", newString);
        return result;
    }

    static void swap(String[] arr, int start, int end) {
        String temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
