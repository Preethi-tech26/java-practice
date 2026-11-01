package junitdemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void nullInputIsNotPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome(null));
    }
}