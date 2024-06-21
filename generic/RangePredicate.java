import java.util.List;
import java.util.function.Predicate;

public class RangePredicate <T extends Comparable> implements Predicate<T> {
    public T left;
    public T right;

    public RangePredicate(T left, T right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean test(T t) {
        return t.compareTo(left) > 0 && t.compareTo(right) <0;
    }
    public <E extends T> int numbersInRange(List<E> lista){
        Predicate<T> predykat = this;
        return (int) lista.stream().filter(predykat).count();
    }
}
