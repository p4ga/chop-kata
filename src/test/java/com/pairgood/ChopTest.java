package com.pairgood;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ChopTest {

    private Chopper forwardSearch;
    private Chopper backwardSearch;
    private List<Integer> numbers;

    @Before
    public void setUp() {
        //arrange
        forwardSearch = new ForwardSearch();
        backwardSearch = new BackwardSearch();

        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    public void backward_GivenAnArrayOfOrderedNumbersWhen_I_LookForExistingNumberThenThatPositionReturned() {
        //act
        int position = backwardSearch.search(2, numbers);

        //assert
        Assert.assertEquals(1, position);
    }

    @Test
    public void backward_GivenAnArrayOfOrderedNumbersWhen_I_LookForTheLastNumberThenThatPositionReturned() {
        //act
        int position = backwardSearch.search(3, numbers);

        //assert
        Assert.assertEquals(2, position);
    }

    @Test
    public void backward_GivenAnArrayOfOrderedNumbersWhen_I_LookForNonExistingNumberThenNegativeOneReturned() {
        //act
        int position = backwardSearch.search(4, numbers);

        //assert
        Assert.assertEquals(-1, position);
    }

    @Test
    public void forward_GivenAnArrayOfOrderedNumbersWhen_I_LookForExistingNumberThenThatPositionReturned() {
        //act
        int position = forwardSearch.search(2, numbers);

        //assert
        Assert.assertEquals(1, position);
    }

    @Test
    public void forward_GivenAnArrayOfOrderedNumbersWhen_I_LookForTheLastNumberThenThatPositionReturned() {
        //act
        int position = forwardSearch.search(3, numbers);

        //assert
        Assert.assertEquals(2, position);
    }

    @Test
    public void forward_GivenAnArrayOfOrderedNumbersWhen_I_LookForNonExistingNumberThenNegativeOneReturned() {
        //act
        int position = forwardSearch.search(4, numbers);

        //assert
        Assert.assertEquals(-1, position);
    }

}
