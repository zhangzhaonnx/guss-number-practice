package com.itutry.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

  public static final int CHANCE_LIMIT = 6;
  public static final String WRIGHT_OUTPUT = "4A0B";

  public static void main(String[] args) {
    GussNumberGame game = new GussNumberGame(new RandomAnswerGenerator(),
        new SimpleAnswerValidator());
    Scanner scanner = new Scanner(System.in);
    List<Record> records = new ArrayList<>();

    String description = "这是一个猜数字游戏，系统已经生成好一个4位数，你有%s次猜测的机会。";
    System.out.println(String.format(description, CHANCE_LIMIT));

    boolean right = false;
    int count = 0;
    while (count < CHANCE_LIMIT) {
      System.out.println("请输入猜测的数字：");
      String input = scanner.nextLine();
      String output = game.guess(input);

      records.add(new Record(input, output));
      printRecords(records);

      if (output.equals(WRIGHT_OUTPUT)) {
        right = true;
        break;
      }
      count++;
    }

    if (right) {
      System.out.println("恭喜你，回答正确！");
    } else {
      System.out.println(String.format("很遗憾，你已用完所有机会，正确答案是 %s.", game.getAnswer()));
    }
  }

  private static void printRecords(List<Record> records) {
    System.out.println("\tinput\t\toutput");
    for (Record record : records) {
      System.out.println(String.format("\t%s\t\t%s", record.getInput(), record.getOutput()));
    }
  }
}
