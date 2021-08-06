package com.mayuri;

public final class MaxMinValue {

    static class ValueLimit {
        private int min_value;
        private int max_value;
    }

    static ValueLimit getMinAndMaxValueOfArray(final int[] arr, final int arrsize) {
        ValueLimit vl = new ValueLimit();
        int i;

        if (arrsize == 1) {
            vl.max_value = arr[0];
            vl.min_value = arr[0];
            return vl;
        }

        if (arr[0] > arr[1]) {
            vl.max_value = arr[0];
            vl.min_value = arr[1];
        } else {
            vl.max_value = arr[1];
            vl.min_value = arr[0];
        }

        for (i = 2; i < arrsize; i++) {
            if (arr[i] > vl.max_value) {
                vl.max_value = arr[i];
            } else if (arr[i] < vl.min_value) {
                vl.min_value = arr[i];
            }
        }

        return vl;
    }

    /**
     * @param args This is the main method array
     */
    // @edu.umd.cs.findbugs.annotations.SuppressFBWarnings({"VA_FORMAT_STRING_USES_NEWLINE", "VA_FORMAT_STRING_USES_NEWLINE"})
    public static void main(final String[] args) {
        final int[] arr = {1000, 11, 445, 1, 330, 3000};
        final  int minmaxsize = 6;
        ValueLimit c = getMinAndMaxValueOfArray(arr, minmaxsize);

        System.out.printf(" min number is %d", c.min_value);
        System.out.println("");
        System.out.printf(" max number is %d", c.max_value);
        System.out.println("");
    }
}