import java.util.Collection;
import java.util.Comparator;

public class CollectionComprator implements Comparator<Collection<?>> {
    public int compare(Collection<? extends Number> o1, Collection<?extends Number> o2) {
        double sum1 = o1.stream().mapToDouble(Number::doubleValue).sum();
        double sum2 = o2.stream().mapToDouble(Number::doubleValue).sum();
        return Double.compare(sum1,sum2);
    }

    @Override
    public int compare(Collection<?> o1, Collection<?> o2) {
        return Integer.compare(o1.size(),o2.size());
    }
}
