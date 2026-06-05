package com.huidos22.algoritmos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JewelryStoreMinimum {

    /**
     * Constraints:
     * 1 <= R <= 10^5
     * N >= 1
     *
     * N = total jewel types
     * visibleJewels[0] = R
     * visibleJewels[1..R] = visible jewel types
     */
    public static int minimumJewels(
            int N,
            List<Integer> visibleJewels) {

        int R = visibleJewels.get(0);

        // Constraint validation
        if (R < 1 || R > 100000) {
            throw new IllegalArgumentException(
                    "R must be between 1 and 10^5");
        }

        Map<Integer, Integer> freq =
                new HashMap<>();

        int maxFreq = 0;

        // Iterate through visible jewels
        for (int i = 1; i <= R; i++) {

            int jewel = visibleJewels.get(i);

            int count =
                    freq.getOrDefault(jewel, 0) + 1;

            freq.put(jewel, count);

            maxFreq = Math.max(maxFreq, count);
        }

        return R + maxFreq - 1;
    }

    public static void main(String[] args) {

        int N = 5;

        List<Integer> visibleJewels =
                Arrays.asList(3, 4, 11, 4);

        int result =
                minimumJewels(N, visibleJewels);

        System.out.println(
                "Minimum jewels in store: "
                        + result);
    }
}