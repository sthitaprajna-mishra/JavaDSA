package com.sthmishra.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FindFirstPalindrome {
    public static void main(String[] args) {
        String[] words = new String[] {"abc","car","ada","racecar","cool"};
        List<String> wordsList = Arrays.asList(words);

        Function<String, Boolean> isPalindrome = (word)-> {
            StringBuilder sb = new StringBuilder();
            sb.append(word);
            return sb.reverse().toString().equals(word);
        };

        String result = wordsList.stream().filter(isPalindrome::apply).findFirst().orElse("");
        System.out.println(result);
    }
}
