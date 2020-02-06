package com.itutry.v2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
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

  @Test
  void should_return_not_duplicate_numbers_when_generator_answer() {
    AnswerGenerator answerGenerator = new RandomAnswerGenerator();

    String answer = answerGenerator.generate();

    Set<String> numbers = new HashSet<>(Arrays.asList(answer.split("")));
    Assert.assertEquals(answer.length(), numbers.size());
  }
}
