package ACO7.week6.day1;

/**
 * Created by acer on 25.08.2015.
 */
import ACO7.collections.IList;
import ACO7.collections.IStack;
import ACO7.collections.impl.MyList;
import ACO7.collections.impl.MyStack;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestForEach {
    public static void main(String[] args) {
        int[] mas = {1, 5, 3, 1, 7, 2, 5};

        for (int i : mas) {
            System.out.print(i + " ");
        }
        System.out.println();

        List<Integer> list = Arrays.asList(1, 5, 3, 1, 7, 2, 5);

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();

        IList<Integer> myList = new MyList<Integer>();
        myList.add(1);
        myList.add(5);
        myList.add(3);
        myList.add(1);
        myList.add(7);
        myList.add(2);
        myList.add(5);

        for (Integer i : myList) {
            System.out.print(i + " ");
        }
        System.out.println();

        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();


        IStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        for (Integer integer : stack) {
            System.out.println(integer);
        }



    }
}
