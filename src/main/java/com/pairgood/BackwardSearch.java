package com.pairgood;

import java.util.List;

public class BackwardSearch implements Chopper {

    @Override
    public Integer search(Integer searchValue, List<Integer> numbers) {
        int lastIndex = numbers.size() - 1;
        for(int i = lastIndex; i > -1; i--) {
            if (numbers.get(i) == searchValue){
                return i;
            }
        }
        return -1;
    }
}
