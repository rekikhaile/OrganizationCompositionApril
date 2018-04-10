package com.rekik.organizationcomposition;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean empDone = false;
        boolean orgDone = false;
        String empAnswer = "";
        String orgAnswer = "";
        Employee employee;
        Organization organization;
        ArrayList<Organization> organizations = new ArrayList<>();

        do{
            //organization = new Organization();
            System.out.println("Enter the name of an organization:");
            //organization.setName(reader.nextLine());
            organization = new Organization(reader.nextLine());


            
            do{

                employee = new Employee();

                System.out.println("Enter and employee number :");
                employee.setEmployeeNr(reader.nextLine());

                System.out.println("Enter and employee first name :");
                employee.setFirstName(reader.nextLine());

                System.out.println("Enter and employee last name :");
                employee.setLastName(reader.nextLine());

                organization.addEmployee(employee);

                System.out.println("Do you want to enter details of another employee?");
                empAnswer=reader.nextLine();

                if (empAnswer.equalsIgnoreCase("no") || empAnswer.equalsIgnoreCase("n"))
                    empDone=true;
                else empDone = false;
                //terinary operator
                System.out.println("You responded:" + (empDone ? "I am done" : "I am not done"));



        }while (!empDone);

            organizations.add(organization);

            System.out.println("Do you want to enter details of another organization?");
            orgAnswer=reader.nextLine();

            if (orgAnswer.equalsIgnoreCase("no") || orgAnswer.equalsIgnoreCase("n"))
                orgDone=true;
            else orgDone = false;

            //terinary operator
            System.out.println("You responded:" + (orgDone ? "I am done" : "I am not done"));


        }while(!orgDone);

        for (Organization eachOrganization:organizations) {
            System.out.println("These are the employess in organization "+eachOrganization.getName());
            for (Employee eachEmployee:eachOrganization.getTheEmployees()) {

                System.out.println("These are the details of the employee: Employee Number " + eachEmployee.getEmployeeNr() +
                        " First name " + eachEmployee.getFirstName() + " Room:" + eachEmployee.getLastName());
            }

        }


    }
}
