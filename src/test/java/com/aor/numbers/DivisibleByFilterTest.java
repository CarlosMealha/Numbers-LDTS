package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class DivisibleByFilterTest {
    @Test
    void DivisibleByTwo(){
        DivisibleByFilter filter = new DivisibleByFilter(2);
        List<Integer> can = Arrays.asList(4,6,8,10,100);
        List<Integer> cannot = Arrays.asList(1,5,7,21,501);

        for(int n : can)
            Assertions.assertTrue(filter.accept(n));

        for(int n : cannot)
            Assertions.assertFalse(filter.accept(n));
    }

}
