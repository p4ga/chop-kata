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
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    public void backward_GivenAnArrayOfOrderedNumbersWhen_I_LookForExistingNumberThenThatPositionReturned() {
        for(Chopper searchAlgorithm : searchAlgorithms){
            int position = searchAlgorithm.search(2, numbers);

            Assert.assertEquals("Failed for " + searchAlgorithm.getClass().getName(),
                    1, position);
        }

    }

    @Test
    public void backward_GivenAnArrayOfOrderedNumbersWhen_I_LookForTheLastNumberThenThatPositionReturned() {
        for(Chopper searchAlgorithm : searchAlgorithms){
            int position = searchAlgorithm.search(3, numbers);

            Assert.assertEquals("Failed for " + searchAlgorithm.getClass().getName(),
                    2, position);
        }

    }

    @Test
    public void backward_GivenAnArrayOfOrderedNumbersWhen_I_LookForNonExistingNumberThenNegativeOneReturned() {

        for(Chopper searchAlgorithm : searchAlgorithms){
            int position = searchAlgorithm.search(4, numbers);

            Assert.assertEquals("Failed for " + searchAlgorithm.getClass().getName(),
                    -1, position);
        }

    }

}
