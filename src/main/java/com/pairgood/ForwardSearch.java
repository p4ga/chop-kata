package com.pairgood;

import java.util.List;

public class ForwardSearch implements Chopper {
    @Override
    public Integer search(Integer searchValue, List<Integer> numbers) {
        for(int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == searchValue){
                return i;
            }
        }
        return -1;
    }
}

