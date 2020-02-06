package com.itutry.v2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RandomAnswerGeneratorTest {

  @Test
  void should_return_4_digits_when_generator_answer() {
    AnswerGenerator answerGenerator = new RandomAnswerGenerator();

    String answer = answerGenerator.generate();

    Assert.assertEquals(4, answer.length());
    for (char num : answer.toCharArray()) {
      Assert.assertTrue(Character.isDigit(num));
    }
  }
}