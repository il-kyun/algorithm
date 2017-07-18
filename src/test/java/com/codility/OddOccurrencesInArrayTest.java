package com.codility;

        import org.junit.Assert;
        import org.junit.Test;

/**
 * Created by IK on 2017-07-18.
 */
public class OddOccurrencesInArrayTest {
    @Test
    public void test() {
        OddOccurrencesInArray o = new OddOccurrencesInArray();
        int[] arr = {9, 3, 9, 3, 9, 7, 9};
        int result = o.solution(arr);
        Assert.assertEquals(7, result);
    }

    @Test
    public void test1() {
        OddOccurrencesInArray o = new OddOccurrencesInArray();
        int[] arr = {9, 3, 9, 3, 9, 7, 9,1,1,1,1,1,1};
        int result = o.solution(arr);
        Assert.assertEquals(7, result);
    }

    @Test
    public void test2() {
        OddOccurrencesInArray o = new OddOccurrencesInArray();
        int[] arr = {2,2,3,3,7,7,9, 3, 9, 3, 9, 7, 9,1,1,1,1,1,1};
        int result = o.solution(arr);
        Assert.assertEquals(7, result);
    }

    @Test
    public void test11() {
        OddOccurrencesInArray o = new OddOccurrencesInArray();
        int[] arr = {9, 3, 9, 3, 9, 7, 9};
        int result = o.solution1(arr);
        Assert.assertEquals(7, result);
    }

    @Test
    public void test111() {
        OddOccurrencesInArray o = new OddOccurrencesInArray();
        int[] arr = {9, 3, 9, 3, 9, 7, 9,1,1,1,1,1,1};
        int result = o.solution1(arr);
        Assert.assertEquals(7, result);
    }

    @Test
    public void test112() {
        OddOccurrencesInArray o = new OddOccurrencesInArray();
        int[] arr = {2,2,3,3,7,7,9, 3, 9, 3, 9, 7, 9,1,1,1,1,1,1};
        int result = o.solution1(arr);
        Assert.assertEquals(7, result);
    }

    @Test
    public void test22() {
        OddOccurrencesInArray o = new OddOccurrencesInArray();
        int[] arr = {9, 3, 9, 3, 9, 7, 9};
        int result = o.solution2(arr);
        Assert.assertEquals(7, result);
    }

    @Test
    public void test221() {
        OddOccurrencesInArray o = new OddOccurrencesInArray();
        int[] arr = {9, 3, 9, 3, 9, 7, 9,1,1,1,1,1,1};
        int result = o.solution2(arr);
        Assert.assertEquals(7, result);
    }

    @Test
    public void test222() {
        OddOccurrencesInArray o = new OddOccurrencesInArray();
        int[] arr = {2,2,3,3,7,7,9, 3, 9, 3, 9, 7, 9,1,1,1,1,1,1};
        int result = o.solution2(arr);
        Assert.assertEquals(7, result);
    }
}
