package ca.vanier.passingscore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PassingScoreTest 
{
    @Test
    public void failingScore()
    {
        boolean passed = ScoreManager.passingScore(3);        
        assertFalse(passed);
    }

    @Test
    public void failingScoreWithEquals()
    {
        boolean passed = ScoreManager.passingScore(3);        
        assertEquals(false ,passed);
    }

    @Test
    public void passingScoreWith6()
    {
        boolean passed = ScoreManager.passingScore(6);        
        assertEquals(true ,passed);
    }

    @Test
    public void passingScoreWith10()
    {
        boolean passed = ScoreManager.passingScore(10);        
        assertEquals(true ,passed);
    }

}
