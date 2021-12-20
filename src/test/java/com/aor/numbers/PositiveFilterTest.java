package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PositiveFilterTest{

  @Test
  void Accept(){
    PositiveFilter filter = new PositiveFilter();
    List<Integer> yes = Arrays.asList(1,2,3,4,5,6,7);
    List<Integer> no = Arrays.asList(-1,-2,-3,-4,-5,-6);

    for(int num : yes)
      Assertions.assertTrue(filter.accept(num));

    for(int num : no)
      Assertions.assertFalse(filter.accept(num));
  }
}