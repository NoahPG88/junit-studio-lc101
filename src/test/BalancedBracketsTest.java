package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    //TRUE TESTS
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsBeforeCharsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]a;slwoienz"));
    }

    @Test
    public void bracketsAfterCharsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("a;slwoienz[]"));
    }

    @Test
    public void bracketsSurroundCharsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[a;slwoienz]"));
    }

    @Test
    public void bracketsAmidCharsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("a;s[lwoien]z"));
    }

    @Test
    public void multipleBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
    }



    //FALSE TESTS
    @Test
    public void multipleNestedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void reversedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void bracketsBeforeCharsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("][a;slwoienz"));
    }

    @Test
    public void bracketsAfterCharsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("a;slwoienz]["));
    }

    @Test
    public void bracketsSurroundCharsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]a;slwoienz["));
    }

    @Test
    public void bracketsAmidCharsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("a;s]lwoien[z"));
    }


}
