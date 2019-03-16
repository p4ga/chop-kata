package com.pairgood;

public class OneByOneSearch implements Chopper {
    @Override
    public int search(int searchValue, int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchValue){
                return i;
            }
        }
        return -1;
    }
}
