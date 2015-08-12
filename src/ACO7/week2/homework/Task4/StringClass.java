package ACO7.week2.homework.Task4;

/**
 * Created by acer on 23.07.2015.
 */
public class StringClass {
    /*Написать класс строка
	- создание на основе массива символов
	- вывод на экран
	- конкатенация
	- понижение регистра
	- повышение регистра
	- поиск подстроки
	- выделение подстроки
	- удаление пробелов
	- метод для сравнения с другой строкой*/

    private char[] elements;

    public StringClass(int length){
        elements = new char[length];

    }

    public void fillmass(){
        for (int i = 0; i <elements.length ; i++) {
            elements[i] = (char) (Math.random()*10);
            System.out.print(elements[i]+"");
        }
    }
}
