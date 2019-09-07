package com.sherry;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.List;

public class NewMain {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<Employee>();

        int choice, num,id;

        try {
            while (true) {
                System.out.println("***********MENU***********");
                System.out.println("1- Add in Employee" +
                        "\n2- Delete an employee" +
                        "\n3- Search an employee" +
                        "\n4- Update an employee" +
                        "\n5- Show All" +
                        "\n6- Exit");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        scanner.nextLine();
                        System.out.println("Enter employee name ");
                        String name = scanner.nextLine();
                        System.out.println("Enter employee id ");
                         id = scanner.nextInt();
                         System.out.println("Enter salary");
                        float salary = scanner.nextFloat();
                        Employee employee = new TeamLeader(name, id, salary);
                        employeeList.add(employee);
                        break;
                    case 2:
                        System.out.println("enter the employee id ");
                         id=scanner.nextInt();
                         int i;
                         for( i=0;i<employeeList.size();i++){
                          if(employeeList.get(i).id==id){
                              employeeList.remove(i);
                              break;
                          }

                         }if(i==employeeList.size()){
                        System.out.println("ID not found");
                    }
                         else
                        System.out.println("Removed successfully");

                         break;
                    case 3:
                        System.out.println("enter the employee id ");
                        id=scanner.nextInt();
                        int  j;
                        for( j=0;j<employeeList.size();j++) {
                            if (employeeList.get(j).id == id) {
                                System.out.println(employeeList.get(j).name);
                                System.out.println(employeeList.get(j).id);
                                System.out.println(employeeList.get(j).salary);
                                break;
                            }}
                            if (j == employeeList.size()) {
                                System.out.println("InValid ID");
                            }

                            break;
                    case 4:


                        System.out.println("Enter employee id ");
                        id = scanner.nextInt();
                        System.out.println("Enter salary");
                         salary = scanner.nextFloat();
                        try{
                         for(j=0;j<=employeeList.size();j++){
                             if(employeeList.get(j).id==id){
                                employeeList.get(j).salary=salary;
                                break;
                             }
                         }}catch (IndexOutOfBoundsException e){
                            System.out.println("Invalid ID");
                        }
//                         if (j == employeeList.size()) {
//                        System.out.println("InValid ID");
//                    }else
//                        System.out.println("update successfully");
                         break;


                         case 5:
                        for (Employee emp : employeeList) {
                            System.out.println(emp.id);
                            System.out.println(emp.name);
                            System.out.println(emp.salary);
                            System.out.println("----------------------------------");

                        }
                        break;
                    case 6:
                        System.exit(0);
                }


            }


        } catch (Exception ex) {
            System.out.println("error occured");
        }
    }
}
