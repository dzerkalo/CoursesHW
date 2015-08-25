package ACO7.week5.day1;

/**
 * Created by acer on 21.08.2015.
 */
public class Cat implements Cloneable {
    private final String name;
    private int age;

    public Cat(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Cat clone() {
/* ������������� ������������
    Cat clonedCat = null;
    try {
      clonedCat = (Cat) super.clone();
    } catch (CloneNotSupportedException exception) {
      System.err.println("clone failed");
      exception.printStackTrace();
    }
    return clonedCat;
*/
        Cat clonedCat = new Cat(new String(name));
        clonedCat.age = age;
        return clonedCat;
    }

    public void foo() throws CloneNotSupportedException{
        super.clone();
        System.out.println("hello");
    }
}
