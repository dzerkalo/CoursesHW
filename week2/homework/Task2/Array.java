package ACO7.week2.homework.Task2;

/**
 * Created by acer on 22.07.2015.
 */
public class Array {

    /*�������� ����� ������.
	- ���������� ������������
	- ���������� �������������
	- ���������� ���������� ������� � ���������
	- �������� ����� �� ����� {2 4 5 6}
	-* ��������� ������
	-* ������� ���������� �������
	-* ����� ��� ��������� � ������ ��������*/


    private int[] elements;


    public Array(int length) {

        elements = new int[length];
    }

    public void fillArr(){
        for (int i = 0; i <elements.length ; i++) {
            elements[i] = (int) (Math.random() * 10);
            System.out.print(elements[i] + " ");
        }
    }

    public int FindMin(){
        int min = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if(elements[i]< min){
                min = elements[i];
            }
        }
        return min;
    }

    public int FindMax(){
        int max = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if(elements[i] > max){
                max = elements[i];
            }
        }
        return max;
    }
}