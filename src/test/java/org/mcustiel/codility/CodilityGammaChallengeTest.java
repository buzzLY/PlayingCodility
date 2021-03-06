package org.mcustiel.codility;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

// WORK IN PROGRESS

public class CodilityGammaChallengeTest {
    private CodilityGammaChallenge testee;

    @Before
    public void init() {
    	testee = new CodilityGammaChallenge();
    }

    @Test
    public void shouldHaveTwoPalindromsWithFourChars() {
    	assertThat(testee.solution("abaa"), is(2));
    }

    @Test
    public void shouldHaveFivePalindromsWithSixChars() {
    	assertThat(testee.solution("abbabb"), is(5));
    }

    @Test
    public void shouldHaveFourPalindromsWithFiveChars() {
    	assertThat(testee.solution("abaaa"), is(4));
    }

    @Test
    public void shouldHaveOnePalindromWithTwoChars() {
    	assertThat(testee.solution("aa"), is(1));
    }

    @Test
    public void shouldHaveSixPalindroms() {
    	assertThat(testee.solution("abcbabb"), is(4));
    }

    @Test
    public void shouldHaveTwoPalindromWithFiveChars() {
    	assertThat(testee.solution("abcba"), is(2));
    }

    @Test
    public void shouldHaveOnePalindromThreeChars() {
    	assertThat(testee.solution("aba"), is(1));
    }

    @Test
    public void shouldNotHavePalindromWithOneChar() {
    	assertThat(testee.solution("a"), is(0));
    }

    @Test
    public void shouldNotHavePalindromWithTwoChars() {
    	assertThat(testee.solution("ab"), is(0));
    }

    @Test
    public void shouldNotHavePalindromWithThreeChars() {
    	assertThat(testee.solution("abb"), is(0));
    }

    @Test
    public void shouldNotHavePalindromWithFiveChars() {
    	assertThat(testee.solution("abcde"), is(0));
    }

    @Test
    public void shouldNotHavePalindromWithSevenCharsStartingPalindrom() {
    	assertThat(testee.solution("abcdeba"), is(0));
    }
}
