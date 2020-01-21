package com.itutry.v1;

import static org.hamcrest.CoreMatchers.is;

import java.util.List;
import java.util.Map.Entry;
import org.junit.Assert;
import org.junit.Test;

public class GussNumberGameTest {

  @Test
  public void should_output_1A0B() {
    GussNumberGame game = new GussNumberGame();
    List<Entry<String, String>> result = game.guss("1 5 6 7");

    Assert.assertThat(result.get(0).getKey(), is("1 5 6 7"));
    Assert.assertThat(result.get(0).getValue(), is("1A0B"));
  }
}
