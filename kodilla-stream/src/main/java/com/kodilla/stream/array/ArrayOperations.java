package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.IntConsumer;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.range;

public interface ArrayOperations {

    static OptionalDouble getAverage(int[] numbers) {

        IntStream stream  = IntStream.range(0,20);
                stream.forEach(num -> System.out.println(numbers[num]));

        IntStream stream2 = IntStream.of(numbers);
        OptionalDouble averageValue =stream2.average();

        return averageValue;
    }
}