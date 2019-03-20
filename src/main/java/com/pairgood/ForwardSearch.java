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
        return -100;
    }
}

//search for 1 in 123 return 0
//search for 1 in 321 return 0

