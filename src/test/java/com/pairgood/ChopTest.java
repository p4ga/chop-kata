package com.pairgood;

import org.junit.Assert;
import org.junit.Test;

public class ChopTest {

    @Test
    public void givenAnArrayOfOrderedNumbersWhen_I_LookForExistingNumberThenThatPositionReturned() {

        //arrange
        int[] numbers = new int[]{1, 2, 3};

        Chopper chopper = new OneByOneSearch();

        //act
        int position = chopper.search(2, numbers);

        //assert
        Assert.assertEquals(1, position);
    }

    @Test
    public void givenAnArrayOfOrderedNumbersWhen_I_LookForNonExistingNumberThenNegativeOneReturned() {

        //arrange
        int[] numbers = new int[]{1, 2, 3};

        Chopper chopper = new OneByOneSearch();

        //act
        int position = chopper.search(4, numbers);

        //assert
        Assert.assertEquals(-1, position);
    }

}
