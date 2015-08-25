package ACO7.collections;

/**
 * Created by acer on 11.08.2015.
 */
public interface IList<T> extends ICollection<T>{

    boolean add(T obj, int index);

    boolean remove(int index);

    T get(int index);

}
