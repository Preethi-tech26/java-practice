package junitdemo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class PalindromeCheckerParamTest {

    @ParameterizedTest
    @CsvSource({
            "level,  true",
            "banker, false",
            "Madam,  true",
            "a,      true",
            "'',     true"
    })
    void palindromeCases(String text, boolean expected) {
        assertEquals(expected, PalindromeChecker.isPalindrome(text));
    }
}
