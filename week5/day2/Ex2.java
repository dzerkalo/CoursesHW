package ACO7.week5.day2;

/**
 * Created by acer on 21.08.2015.
 */

import ACO7.collections.IList;
import ACO7.collections.impl.MyList;

public class Ex2 {
    public static void main(String[] args) {
        IList<Integer> list = new MyList<Integer>();

        list.add(5);
        list.add(9);

        list.add(14, 7);
        System.out.println(list.get(1));

        //autoboxing
//    Integer i1 = new Integer(4);
        Integer i1 = 4;
        int a = i1;

        foo(a);
        foo(i1);
    }

    public static void foo(int number){
        System.out.println(number);
    }
}
