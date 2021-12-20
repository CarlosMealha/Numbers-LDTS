package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {

  @Test
  public void deduplicate() {
    List<Integer> list = Arrays.asList(1,2,4,2,5,6);
    List<Integer> expected = Arrays.asList(1,2,4,5,6);

    ListDeduplicator deduplicator = new ListDeduplicator();
    List<Integer> distinct = deduplicator.deduplicate(list);

    Assertions.assertEquals(expected, distinct);
  }

  @Test
  public void bug_sort_8276(){
    List<Integer> list = Arrays.asList(1,2,2,4);
    List<Integer> expected = Arrays.asList(1,2,4);

    ListDeduplicator deduplicator = new ListDeduplicator();
    List<Integer> sort = deduplicator.deduplicate(list);

    Assertions.assertEquals(expected, sort);
  }
}