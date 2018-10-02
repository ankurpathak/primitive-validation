package com.github.ankurpathak.primitive.bean.constraints.util;

import java.lang.reflect.Array;

public class ArrayUtils {

    public static int getLength(Object array) {
        return array == null ? 0 : Array.getLength(array);
    }

    public static boolean isEmpty(Object[] array) {
        return getLength(array) == 0;
    }

    public static boolean isEmpty(long[] array) {
        return getLength(array) == 0;
    }

    public static boolean isEmpty(int[] array) {
        return getLength(array) == 0;
    }

    public static boolean isEmpty(short[] array) {
        return getLength(array) == 0;
    }

    public static boolean isEmpty(char[] array) {
        return getLength(array) == 0;
    }

    public static boolean isEmpty(byte[] array) {
        return getLength(array) == 0;
    }

    public static boolean isEmpty(double[] array) {
        return getLength(array) == 0;
    }

    public static boolean isEmpty(float[] array) {
        return getLength(array) == 0;
    }

    public static boolean isEmpty(boolean[] array) {
        return getLength(array) == 0;
    }

    public static <T> boolean isNotEmpty(T[] array) {
        return !isEmpty(array);
    }

    public static boolean isNotEmpty(long[] array) {
        return !isEmpty(array);
    }

    public static boolean isNotEmpty(int[] array) {
        return !isEmpty(array);
    }

    public static boolean isNotEmpty(short[] array) {
        return !isEmpty(array);
    }

    public static boolean isNotEmpty(char[] array) {
        return !isEmpty(array);
    }

    public static boolean isNotEmpty(byte[] array) {
        return !isEmpty(array);
    }

    public static boolean isNotEmpty(double[] array) {
        return !isEmpty(array);
    }

    public static boolean isNotEmpty(float[] array) {
        return !isEmpty(array);
    }

    public static boolean isNotEmpty(boolean[] array) {
        return !isEmpty(array);
    }


}
