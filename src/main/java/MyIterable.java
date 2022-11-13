import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;
import java.util.function.Consumer;

public interface MyIterable<T> {
    Iterator<T> iterator();
    ListIterator<T> listIterator();

}
