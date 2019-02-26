package rockmelon.library.algorithms.sort

/**
 * Created by reid gareth on 2/20/18.
 */
public interface ISort<T> {
    List<T> Execute(List<T> listToSort)
}

public trait Sortable<T>
{
    public Boolean GreaterThen(T first, T second){
        return first > second
    }

    public Boolean LessThen(T first, T second) {
        return first < second
    }

    public Boolean GreaterThenOrEqualTo(T first, T second){
        return first >= second
    }

    public Boolean LessThenOrEqualTo(T first, T second){
        return first <= second
    }
}

