package com.itutry.v2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleAnswerValidatorTest {
// empty
  // 长度
  // 重复

  @Test
  void should_throw_exception_when_validate_given_answer_length_not_4() {
    AnswerValidator validator = new SimpleAnswerValidator();

    assertThrows(InvalidAnswerException.class, () -> validator.validate(""));
    assertThrows(InvalidAnswerException.class, () -> validator.validate("89767"));
  }

  @Test
  void should_throw_exception_when_validate_given_answer_not_digit() {
    AnswerValidator validator = new SimpleAnswerValidator();

    assertThrows(InvalidAnswerException.class, () -> validator.validate("abcd"));
  }

  @Test
  void should_throw_exception_when_validate_given_answer_duplicate() {
    AnswerValidator validator = new SimpleAnswerValidator();

    assertThrows(InvalidAnswerException.class, () -> validator.validate("1123"));
  }
}
