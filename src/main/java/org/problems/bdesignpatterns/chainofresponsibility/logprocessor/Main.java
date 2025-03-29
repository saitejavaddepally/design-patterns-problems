package org.problems.bdesignpatterns.chainofresponsibility.logprocessor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{36, 28, 53, 11, 9, 23, 17, 28, 36};

        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = Arrays.stream(arr).filter(x -> !set.add(x)).boxed().toList();

        System.out.println(list);
    }
}