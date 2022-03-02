package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public OddNumbersExterminator() {
    }

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> oddNumbersList = new ArrayList();

        for(int i = 0; i < numbers.size(); ++i) {
            if ((Integer)numbers.get(i) % 2 == 0) {
                oddNumbersList.add((Integer)numbers.get(i));
            }
        }

        return oddNumbersList;
    }
}