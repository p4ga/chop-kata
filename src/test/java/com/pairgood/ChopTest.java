package com.pairgood;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ChopTest {

    private List<Chopper> searchAlgorithms;
    private List<Integer> numbers;

    @Before
    public void setUp() {
        searchAlgorithms = new ArrayList<>();
        searchAlgorithms.add(new ForwardSearch());
        searchAlgorithms.add(new BackwardSearch());

        numbers = new ArrayList<>();

        for(int i = 1; i <= 100; i++){
            numbers.add(i);
        }
    }

    @Test
    public void search_ForNumberIn_LowerHalf() {
        for(Chopper searchAlgorithm : searchAlgorithms){
            int position = searchAlgorithm.search(12, numbers);

            Assert.assertEquals("Failed for " + searchAlgorithm.getClass().getName(),
                    11, position);
        }

    }

    @Test
    public void search_ForNumberIn_Middle() {
        for(Chopper searchAlgorithm : searchAlgorithms){
            int position = searchAlgorithm.search(12, numbers);

            Assert.assertEquals("Failed for " + searchAlgorithm.getClass().getName(),
                    11, position);
        }

    }

    @Test
    public void search_ForNumberIn_UpperHalf() {
        for(Chopper searchAlgorithm : searchAlgorithms){
            int position = searchAlgorithm.search(87, numbers);

            Assert.assertEquals("Failed for " + searchAlgorithm.getClass().getName(),
                    86, position);
        }

    }

    @Test
    public void search_ForNonExistingNumber() {

        for(Chopper searchAlgorithm : searchAlgorithms){
            int position = searchAlgorithm.search(400, numbers);

            Assert.assertEquals("Failed for " + searchAlgorithm.getClass().getName(),
                    -1, position);
        }

    }

}
