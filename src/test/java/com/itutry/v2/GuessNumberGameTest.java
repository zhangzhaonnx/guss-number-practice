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
}
