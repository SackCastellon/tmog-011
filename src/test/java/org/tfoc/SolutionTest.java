package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@Slf4j
class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void example1() {
        var result = solution.letterCombinations("23");

        assertThat(result).containsExactly("ad","ae","af","bd","be","bf","cd","ce","cf");
    }

    @Test
    void example2() {
        var result = solution.letterCombinations("");

        assertThat(result).isEmpty();
    }

    @Test
    void example3() {
        var result = solution.letterCombinations("2");

        assertThat(result).containsExactly("a","b","c");
    }

}
