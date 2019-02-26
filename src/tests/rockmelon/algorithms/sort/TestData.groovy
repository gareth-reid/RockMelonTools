package tests.rockmelon.algorithms.sort

import rockmelon.library.algorithms.sort.Sortable

/**
 * Created by reid gareth on 2/20/18.
 */
public class TestData {
    public static  List<Shoe> Shoes =  [ new Shoe(size: 4), new Shoe(size: 2), new Shoe(size: 7), new Shoe(size: 6), new Shoe(size: 10), new Shoe(size: 4), new Shoe(size: 7), new Shoe(size: 1), new Shoe(size: 5)]
    public static List<Shoe> ShoesWithDublicates =  [ new Shoe(size: 4), new Shoe(size: 4), new Shoe(size: 7), new Shoe(size: 6), new Shoe(size: 11), new Shoe(size: 4), new Shoe(size: 7), new Shoe(size: 7), new Shoe(size: 5)]

    public static Boolean IsListOrdered(List<Sortable> list){
        for (int i = 0; i < list.size() - 1; i++){
            if (list[i + 1] != null && list[i].GreaterThen(list[i + 1])){
                //item is greater then next so list not ordered
                return false
            }
        }
        return true
    }
}
public class Shoe implements Sortable<Shoe> {
    public int size

    public Boolean GreaterThen(Shoe second) {
        if (second == null){
            return true
        }
        return size > second.size
    }

    public Boolean LessThen(Shoe second) {
        if (second == null){
            return true
        }
        return size < second.size
    }

    public Boolean GreaterThenOrEqualTo(Shoe second){
        if (second == null){
            return true
        }
        return size >= second.size
    }

    public Boolean LessThenOrEqualTo(Shoe second){
        if (second == null){
            return true
        }
        return size <= second.size
    }
}