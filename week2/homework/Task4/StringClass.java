package ACO7.week2.homework.Task4;

/**
 * Created by acer on 23.07.2015.
 */
public class StringClass {
    /*�������� ����� ������
	- �������� �� ������ ������� ��������
	- ����� �� �����
	- ������������
	- ��������� ��������
	- ��������� ��������
	- ����� ���������
	- ��������� ���������
	- �������� ��������
	- ����� ��� ��������� � ������ �������*/

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
