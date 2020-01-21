package com.itutry.v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class GussNumberGame {

  public List<Entry<String, String>> guss(String input) {
    List<Integer> numbers = Arrays.stream(input.split(" "))
        .map(Integer::parseInt)
        .collect(Collectors.toList());

    List<Integer> answers = Arrays.asList(1, 2, 3, 4);

    int correctCount = 0;
    for (int i = 0; i < numbers.size(); i++) {
      if (answers.contains(numbers.get(i))) {
        correctCount++;
      }
    }

    String str = String.format("%sA%sB", correctCount, 0);
    ArrayList<Entry<String, String>> result = new ArrayList<>();

    Map<String, String> map = new HashMap<>();
    map.put(input, str);
    return new ArrayList<>(map.entrySet());
  }
}
