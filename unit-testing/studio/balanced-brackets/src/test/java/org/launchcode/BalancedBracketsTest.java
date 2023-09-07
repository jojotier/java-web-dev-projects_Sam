package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
//1
    @Test
    public void hasCorrectBracketPlacement(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launchcode]"));
    }
//2
    @Test
    public void hasOnlyOneBeginningBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launchcode"));
    }
//3
    @Test
    public void hasOnlyOneEndingBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launchcode]"));
    }
//4
    @Test
    public void hasIncorrectBracketPlacement(){
        assertEquals((BalancedBrackets.hasBalancedBrackets("] [")), false);
    }
//5
    @Test
    public void hasNegativeBracketImbalance(){
        assertEquals((BalancedBrackets.hasBalancedBrackets("]]Launch[]Code")), false);
    }
//6
    @Test
    public void hasMultipleBracketsBalanced(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[Launch]]]code"));
    }
//7
    @Test
    public void hasEqualBracketsInOddPlaces(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch][Code]"));
    }
  //8
    @Test
    public void hasEqualBracketsInIncorrectPlaces(){
        assertEquals((BalancedBrackets.hasBalancedBrackets("]Launc[]h[Code")), false);
    }
//9
    @Test
    public void hasPositiveBracketImbalance(){
        assertEquals((BalancedBrackets.hasBalancedBrackets("[[[[[Launch]]C]de")), false);
    }
    //10
    @Test
    public void hasUnequalBracketsInIncorrectPlaces(){
        assertEquals((BalancedBrackets.hasBalancedBrackets("]La[[[unch]code")), false);
    }
    //11
    @Test
    public void hasMultipleBracketsImbalanced(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[launch]code"));
    }
    //12
    @Test
    public void hasNoBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launchcode"));
    }
}