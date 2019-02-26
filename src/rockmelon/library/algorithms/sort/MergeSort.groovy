package rockmelon.library.algorithms.sort
/**
 * Created by reid gareth on 2/20/18.
 */
public class MergeSort implements ISort<Sortable>{
    public List<Sortable> Execute(List<Sortable> listToSort) {
        // create a temp array
        return Merge(listToSort, 0, listToSort.size())
    }

    public List<Sortable> Merge(List<Sortable> arr, int start, int end) {

        if(start < end) {
            int mid = (start + end) / 2;
            Merge(arr, start, mid);
            Merge(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
        return arr
    }

    private void merge(List<Sortable> arr, int start, int mid, int end){
        def temp = new ArrayList<Sortable>(end - start + 1);

        // crawlers for both intervals and for temp
        int i = start, j = mid + 1, k = 0;

        // traverse both arrays and in each iteration add smaller of both elements in temp
        while(i <= mid && j <= end) {
            if(arr[i].LessThenOrEqualTo(arr[j])) {
                temp[k] = arr[i];
                k += 1; i += 1;
            }
            else {
                temp[k] = arr[j];
                k += 1; j += 1;
            }
        }

        // add elements left in the first interval
        while(i <= mid) {
            temp[k] = arr[i];
            k += 1; i += 1;
        }

        // add elements left in the second interval
        while(j <= end) {
            temp[k] = arr[j];
            k += 1; j += 1;
        }

        // copy temp to original interval
        for(i = start; i <= end; i += 1) {
            arr[i] = temp[i - start]
        }
    }
}


