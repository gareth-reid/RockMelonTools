package rockmelon.library.algorithms.sort
/**
 * Created by reid gareth on 2/20/18.
 */
public class InsertionSort implements ISort<Sortable>{
    public List<Sortable> Execute(List<Sortable> listToSort) {
        for (int i = 1; i < listToSort.size(); i++) {
            def key = listToSort.get(i)
            int j = i - 1
            while (j >= 0 && listToSort.get(j).GreaterThen(key)){
                listToSort[j + 1] = listToSort.get(j)
                j--
            }
            listToSort[j + 1] = key
        }


        return listToSort
    }
}


