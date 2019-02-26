package rockmelon.library.algorithms.sort
/**
 * Created by reid gareth on 2/20/18.
 */
public class BubbleSort implements ISort<Sortable>{
    public List<Sortable> Execute(List<Sortable> listToSort) {
        for (int a = 0; a < listToSort.size(); a++) {
            for (int i = 0; i < listToSort.size() - 1; i++) {
                if (listToSort[i].GreaterThen(listToSort[i + 1])) {
                    //swap
                    def value = listToSort[i]
                    listToSort[i] = listToSort[i + 1]
                    listToSort[i + 1] = value
                }
            }
        }
        return listToSort
    }
}


