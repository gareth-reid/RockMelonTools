package tests.rockmelon.algorithms.sort

import org.junit.Assert
import org.junit.Test
import rockmelon.library.algorithms.sort.InsertionSort
import rockmelon.library.algorithms.sort.MergeSort

/**
 * Created by reid gareth on 2/20/18.
 */
public class MergeSortTests
{
    @Test
    public void basicOrderTest()
    {
        def sort = new MergeSort()
        def res = sort.Execute(TestData.Shoes)
        Assert.assertTrue(TestData.IsListOrdered(res))
    }
    @Test
    public void DublicatesOrderTest()
    {
        def sort = new InsertionSort()
        def res = sort.Execute(TestData.ShoesWithDublicates)
        Assert.assertTrue(TestData.IsListOrdered(res))
    }




}
