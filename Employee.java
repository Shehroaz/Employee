package com.sherry;

public abstract class Employee {
    String name;
    int id;
    float salary;

    /**
     * Constructor for Employee
     *
     * @param name name of an Employee
     * @param id id of an Employee
     * @param salary Salary of an Employee
     */
    public Employee(String name,int id,float salary ){

        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    /**
     * Default constructor for an Employee
     */
    public Employee() {

    }

    /**
     * create name of an Employee
     *
     * @param n name of an Employee
     */
    protected void setName(String n){
        name =n;
    }

    /**
     * Get name of an Employee
     *
     * @return name of an Employee
     */
     public  String getName(){
        return name;
    }

    /**
     * Set id of an Employee
     *
     * @param id Id of an Employee
     */
    protected void setId(int id){
        this.id=id;
    }

    /**
     * Get id  of an Employee
     *
     * @return id of an Employee
     */
    protected int getId(){
        System.out.println("the id of employee is "+id);
        return id;
    }

    /**
     * Calculate Salary of an Employee
     *
     * @param hour hour that employee work
     * @param wage per hour rate of work
     * @return salary of an Employee
     */
    protected int calculateSalary(int hour,int wage ){
        int annualSalaray=(hour*wage)*52;
        System.out.println("you hour per week is  "+hour+"$ your hourly wage is  "+wage +"$ so your Annually salary is "
                +annualSalaray+"$");
        return annualSalaray;
    }

    /**
     * Calculate Salary overrided method just calculate hourly salary
     * @param wages per hour rate of work
     */
    protected void calculateSalary(int wages){
        System.out.println(wages+"$ is your hourly  wage ");

    }

    /**
     * overrided method of calculated salary that output salary
     */
    protected  void calculateSalary(){
        System.out.println("the salary is no more");
    }



}


