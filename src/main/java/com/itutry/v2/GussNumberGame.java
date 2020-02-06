package com.itutry.v2;

public class GussNumberGame {

  private static final String RESULT_TEMPLATE = "%sA%sB";
  private String answer;

  public GussNumberGame(String answer) {
    this.answer = answer;
  }

  public String guess(String numbers) {
    int positionAndNumberCorrectCount = 0;
    int onlyNumberCorrectCount = 0;

    for (char num : numbers.toCharArray()) {
      boolean isCorrectNumber = answer.contains(String.valueOf(num));
      boolean isCorrectPosition = answer.indexOf(num) == numbers.indexOf(num);
      if (isCorrectNumber && isCorrectPosition) {
        positionAndNumberCorrectCount++;
      }
      if (isCorrectNumber && !isCorrectPosition) {
        onlyNumberCorrectCount++;
      }
    }

    return String.format(RESULT_TEMPLATE, positionAndNumberCorrectCount, onlyNumberCorrectCount);
  }
}
