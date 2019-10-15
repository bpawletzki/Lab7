package edu.cscc;

import org.junit.Assert;

public class RPSLSpockTest {

    @org.junit.Test
    public void isValidPick() throws Exception {
        // Test all 5 valid possibilities
        Assert.assertTrue(RPSLSpock.isValidPick("rock"));
        Assert.assertTrue(RPSLSpock.isValidPick("paper"));
        Assert.assertTrue(RPSLSpock.isValidPick("scissors"));
        Assert.assertTrue(RPSLSpock.isValidPick("lizard"));
        Assert.assertTrue(RPSLSpock.isValidPick("spock"));
        // Test one invalid possibility
        Assert.assertFalse(RPSLSpock.isValidPick("duck"));

    }

    @org.junit.Test
    public void generatePick() throws Exception {
        // Test for not null 1,000,000 times.
        for (int i=0;i<=100000;i++) {
            Assert.assertNotNull(RPSLSpock.isValidPick(RPSLSpock.generatePick()));
        }
    }

    @org.junit.Test
    public void isComputerWin() throws Exception {
        Assert.assertTrue(RPSLSpock.isComputerWin("rock", "scissors"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper", "rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors", "paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard", "paper"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock", "rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("rock", "lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("paper", "rock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("scissors", "lizard"));
        Assert.assertTrue(RPSLSpock.isComputerWin("lizard", "spock"));
        Assert.assertTrue(RPSLSpock.isComputerWin("spock", "scissors"));
 // Negative test
        Assert.assertFalse(RPSLSpock.isComputerWin("scissors", "spock"));

    }

}