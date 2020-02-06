package com.itutry.v2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class GuessNumberGameTest {

  @Test
  void should_return_4A0B_when_guess_number_given_answer_is_1234_and_guess_is_1234() {
    GussNumberGame guessNumberGame = new GussNumberGame("1234");

    String result = guessNumberGame.guess("1234");

    Assert.assertEquals("4A0B", result);
  }

  @Test
  void should_return_2A2B_when_guess_number_given_answer_is_1234_and_guess_is_1243() {
    GussNumberGame guessNumberGame = new GussNumberGame("1234");

    String result = guessNumberGame.guess("1243");

    Assert.assertEquals("2A2B", result);
  }

  @Test
  void should_return_1A1B_when_guess_number_given_answer_is_1234_and_guess_is_1456() {
    GussNumberGame guessNumberGame = new GussNumberGame("1234");

    String result = guessNumberGame.guess("1456");

    Assert.assertEquals("1A1B", result);
  }
}