package tests.rockmelon.algorithms.sort

import org.junit.Assert
import org.junit.Test
import rockmelon.library.algorithms.sort.BubbleSort
import rockmelon.library.algorithms.sort.InsertionSort
import rockmelon.library.algorithms.sort.TestData

/**
 * Created by reid gareth on 2/20/18.
 */
public class BubbleSortTests
{
    @Test
    public void basicOrderTest()
    {
        def sort = new BubbleSort()
        def res = sort.Execute(TestData.Shoes)
        Assert.assertTrue(TestData.IsListOrdered(res))
    }

    @Test
    public void DublicatesOrderTest()
    {
        def sort = new BubbleSort()
        def res = sort.Execute(TestData.ShoesWithDublicates)
        Assert.assertEquals(TestData.ShoesWithDublicates.sort(), res)
    }
}
