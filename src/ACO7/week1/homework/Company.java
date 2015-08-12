package ACO7.week1.homework;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by acer on 16.07.2015.
 */
public class Company {

     //Company: name, address, number of employees, list of employees
    Scanner sc = new Scanner(System.in);

    String companyName;
    String companyAdress;
    int numEmp;

    Employee[] listOfEmployee = new Employee[5];

    public void readAboutCompany(){
        System.out.println("Company name: " + companyName);
        System.out.println("Compane adress: " + companyAdress);
        System.out.println("Number of employee" + numEmp);
    }

    public  void listOfEmployee(){
        for (int i = 0; i < numEmp; i++) {
            System.out.println(listOfEmployee[i].name);
        }
    }

    public void moreYear(){
        for (int i = 0; i <numEmp; i++) {
            int monthsCount = 12;
            if(listOfEmployee[i].workExp > monthsCount){
                System.out.println(listOfEmployee[i].name);
            }
        }System.out.println();
    }

    public  void girlsKiev(){
        for (int i = 0; i <numEmp; i++) {
            if(listOfEmployee[i].sex.equals("female") && listOfEmployee[i].adress.equals("Kiev")){
                System.out.println(listOfEmployee[i].name);
            }
        } System.out.println();
    }

    public void addEmployee(){

        // Employee: name, salary, address, sex, age, working experience (in months)
        Employee newEmployee = new Employee();

        System.out.println("Enter employee name");
        newEmployee.name = sc.nextLine();

        System.out.println("Enter employee sallary");
        newEmployee.salary = sc.nextInt();

        System.out.println("Enter employee adress");
        newEmployee.adress = sc.nextLine();

        System.out.println("Enter employee sex");
        newEmployee.sex = sc.nextLine();

        System.out.println("Enter working expirience");
        newEmployee.workExp = sc.nextInt();

        listOfEmployee[numEmp] = newEmployee;
        numEmp++;
    }

    public void fireEmployee(){
        System.out.println("Enter name of employee you want fire");
        String fireName = sc.nextLine();
        for (int i = 0; i <numEmp ; i++) {
            if(listOfEmployee[i].equals(fireName)){
                listOfEmployee[i] = null;
            }
        }
        System.out.println();
        listOfEmployee();
    }

    public void listWomMan(){

        for (int i = 0; i <numEmp; i++) {
            if (listOfEmployee[i].sex.equals("female")){
                System.out.println(listOfEmployee[i].name);
            }
        }

        for (int i = 0; i <numEmp; i++) {
            if (listOfEmployee[i].sex.equals("male")){
                System.out.println(listOfEmployee[i].name);
            }
        }
    }

    public void fireLessYearLess1000(){
        for (int i = 0; i <numEmp ; i++) {
            if(listOfEmployee[i] != null) {
            }
            if(listOfEmployee[i].workExp < 12 && listOfEmployee[i].salary < 1000){
                listOfEmployee[i] = null;
            }
        }
        System.out.println();
        listOfEmployee();
    }

}
