package ACO7.collections;

/**
 * Created by acer on 16.08.2015.
 */
public interface IStack<E> extends ICollection<E> {

    E push(E e);

    E pop();

    E peek();
}
