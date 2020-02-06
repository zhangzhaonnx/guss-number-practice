package com.itutry.v2;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GuessNumberGameTest {

  private AnswerGenerator answerGenerator;

  @BeforeEach
  void setUp() {
    answerGenerator = mock(AnswerGenerator.class);
    when(answerGenerator.generate()).thenReturn("1234");
  }

  @Test
  void should_return_4A0B_when_guess_number_given_answer_is_1234_and_guess_is_1234() {
    GussNumberGame guessNumberGame = new GussNumberGame(answerGenerator);

    String result = guessNumberGame.guess("1234");

    Assert.assertEquals("4A0B", result);
  }

  @Test
  void should_return_2A2B_when_guess_number_given_answer_is_1234_and_guess_is_1243() {
    GussNumberGame guessNumberGame = new GussNumberGame(answerGenerator);

    String result = guessNumberGame.guess("1243");

    Assert.assertEquals("2A2B", result);
  }

  @Test
  void should_return_1A1B_when_guess_number_given_answer_is_1234_and_guess_is_1456() {
    GussNumberGame guessNumberGame = new GussNumberGame(answerGenerator);

    String result = guessNumberGame.guess("1456");

    Assert.assertEquals("1A1B", result);
  }

  @Test
  void should_return_0A4B_when_guess_number_given_answer_is_1234_and_guess_is_4321() {
    GussNumberGame guessNumberGame = new GussNumberGame(answerGenerator);

    String result = guessNumberGame.guess("4321");

    Assert.assertEquals("0A4B", result);
  }

  @Test
  void should_return_0A1B_when_guess_number_given_answer_is_1234_and_guess_is_4567() {
    GussNumberGame guessNumberGame = new GussNumberGame(answerGenerator);

    String result = guessNumberGame.guess("4567");

    Assert.assertEquals("0A1B", result);
  }

  @Test
  void should_return_0A0B_when_guess_number_given_answer_is_1234_and_guess_is_5678() {
    GussNumberGame guessNumberGame = new GussNumberGame(answerGenerator);

    String result = guessNumberGame.guess("5678");

    Assert.assertEquals("0A0B", result);
  }
}
