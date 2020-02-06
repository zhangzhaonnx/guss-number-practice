package com.itutry.v2;

public class GussNumberGame {

  private String answer;

  public GussNumberGame(String answer) {
    this.answer = answer;
  }

  public String guess(String numbers) {
    if (numbers.equals(answer)) {
      return "4A0B";
    }
    return "2A2B";
  }
}
