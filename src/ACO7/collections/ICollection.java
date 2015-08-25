package ACO7.collections;

/**
 * Created by acer on 15.08.2015.
 */
public interface ICollection<T> {
    boolean add(T t);

    void clear();

    boolean isEmpty();

    boolean remove(T t);

    int size();

    boolean contains(T t);
}
