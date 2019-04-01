package com.pairgood;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch implements Chopper{

    @Override
    public Integer search(Integer searchValue, List<Integer> numbers) {
        // x = 100
        List<Integer> firstHalf = splitInHalf(numbers);

        final Integer lastDigit = firstHalf.get(firstHalf.size() - 1);

        if(lastDigit == searchValue){
             return firstHalf.size() - 1;
        }else if(lastDigit > searchValue){
            List<Integer> firstHalfNext = splitInHalf(numbers);
            final Integer lastDigitNext = firstHalf.get(firstHalf.size() - 1);
        }
         // 5
         // 12345 5 == 5
        //678910
        return null;
    }

    private List<Integer> splitInHalf(List<Integer> numbers) {
        int total = numbers.size();
        int half = total / 2;

        List<Integer> firstHalf = new ArrayList<>();

        for(int i = 0; i < half; i++){
           firstHalf.add(numbers.get(i));
        }
        return firstHalf;
    }
}
