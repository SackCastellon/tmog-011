package org.tfoc;

import java.util.List;
import java.util.Map;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    private static final Map<Integer, List<String>> letters = Map.of(
        2, List.of("a", "b", "c"),
        3, List.of("d", "e", "f"),
        4, List.of("g", "h", "i"),
        5, List.of("j", "k", "l"),
        6, List.of("m", "n", "o"),
        7, List.of("p", "q", "r", "s"),
        8, List.of("t", "u", "v"),
        9, List.of("w", "x", "y", "z")
    );

    public List<String> letterCombinations(String digits) {
        return digits.chars()
            .map(Character::getNumericValue)
            .mapToObj(letters::get)
            .reduce(List.of(), this::combine);
    }

    private List<String> combine(List<String> heads, List<String> tails) {
        if (heads.isEmpty()) return tails;
        return heads.stream().flatMap(head -> tails.stream().map(head::concat)).toList();
    }

}
