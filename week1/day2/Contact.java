package ACO7.week1.day2;

/**
 * Created by acer on 12.07.2015.
 */
public class Contact {

    String name;
    String phone;
    int age;

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }

    public void showInfo() {
        System.out.println(name + "," + phone + "," + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }
}