package com.itutry.v1;

import static org.hamcrest.CoreMatchers.is;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Stream;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class GussNumberGameTest {

  @ParameterizedTest
  @MethodSource("testArguments")
  public void should_return_output_for_input(String input, String output) {
    GussNumberGame game = new GussNumberGame(Arrays.asList(1, 2, 3, 4));
    List<Entry<String, String>> result = game.guss(input);

    Assert.assertThat(result.get(0).getKey(), is(input));
    Assert.assertThat(result.get(0).getValue(), is(output));
  }

  static Stream<Arguments> testArguments() {
    return Stream.of(
        Arguments.of("1 5 6 7", "1A0B"),
        Arguments.of("2 4 7 8", "0A2B")
    );
  }
}
