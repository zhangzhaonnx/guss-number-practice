package com.itutry.v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class GussNumberGame {

  private List<Integer> answers;

  public GussNumberGame(List<Integer> answers) {
    this.answers = answers;
  }

  public List<Entry<String, String>> guss(String input) {
    List<Integer> numbers = parseInput(input);

    String output;
    if (!checkNumbers(numbers)) {
      output = "Wrong Input, input again";
    } else {
      output = doGuess(numbers);
    }

    Map<String, String> map = new HashMap<>();
    map.put(input, output);
    return new ArrayList<>(map.entrySet());
  }

  private String doGuess(List<Integer> numbers) {
    int correctCount = 0;
    int wrongPositionCount = 0;
    for (int i = 0; i < numbers.size(); i++) {
      int number = numbers.get(i);
      if (answers.contains(number)) {
        if (number == answers.get(i)) {
          correctCount++;
        } else {
          wrongPositionCount++;
        }
      }
    }

    return formatOutput(correctCount, wrongPositionCount);
  }

  private boolean checkNumbers(List<Integer> numbers) {
    Set numberSet = new HashSet(numbers);
    return numberSet.size() == numbers.size();
  }

  private String formatOutput(int correctCount, int wrongPositionCount) {
    return String.format("%sA%sB", correctCount, wrongPositionCount);
  }

  private List<Integer> parseInput(String input) {
    return Arrays.stream(input.split(" "))
        .map(Integer::parseInt)
        .collect(Collectors.toList());
  }
}
