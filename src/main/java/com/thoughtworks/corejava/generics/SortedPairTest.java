package com.thoughtworks.corejava.generics;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by rajatbhatnagar on 12/30/15.
 */
public class SortedPairTest {
    @Test
    public void correctOrderOfSortedPair(){
        SortedPair<Integer> pair = new SortedPair<Integer>(1,2);
        assertEquals(1, pair.getFirst().intValue());
        assertEquals(2,pair.getSecond().intValue());
    }
    @Test
    public void flipOrderOfSortedPair(){
        SortedPair<Integer> pair = new SortedPair<Integer>(7,5);
        assertEquals(5,pair.getFirst().intValue());
        assertEquals(7,pair.getSecond().intValue());
    }
}
