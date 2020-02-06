package com.itutry.v2;

public class GussNumberGame {

  public static final String RESULT_TEMPLATE = "%sA%sB";
  private String answer;

  public GussNumberGame(String answer) {
    this.answer = answer;
  }

  public String guess(String numbers) {
    int positionAndNumberCorrectCount = 0;
    int onlyNumberCorrectCount = 0;

    for (char num : numbers.toCharArray()) {
      if (answer.contains(String.valueOf(num)) && answer.indexOf(num) == numbers.indexOf(num)) {
        positionAndNumberCorrectCount ++;
      }
      if (answer.contains(String.valueOf(num)) && answer.indexOf(num) != numbers.indexOf(num)) {
        onlyNumberCorrectCount ++;
      }
    }

    return String.format(RESULT_TEMPLATE, positionAndNumberCorrectCount, onlyNumberCorrectCount);
  }
}
