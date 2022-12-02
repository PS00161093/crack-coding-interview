package com.challanges;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Permutation {
    public static void main(String[] args) {
        String word = "ABC";
        permuteAndPrintStream("", word);
        System.out.println(permute(word));
    }

    private static void permuteAndPrintStream(String prefix, String word) {
        int n = word.length();
        if (n == 0) {
            System.out.println(prefix + " ");
        } else {
            IntStream.range(0, n)
                    .parallel()
                    .forEach(i -> permuteAndPrintStream(
                            prefix + word.charAt(i),
                            word.substring(i + 1, n) + word.substring(0, i)
                    ));
        }

    }

    private static Set<String> permute(String word) {
        return permute("", word);
    }

    private static Set<String> permute(String prefix, String word) {
        Set<String> permutations = new HashSet<>();
        int n = word.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutations.addAll(
                        permute(prefix + word.charAt(i),
                                word.substring(i + 1, n) + word.substring(0, i)
                        ));
            }
        }

        return permutations;
    }

}
