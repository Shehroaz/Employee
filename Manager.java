package com.sherry;

public class Manager extends Employee{
    String name;
    int scale;

    /**
     * constructor of Manager class
     *
     * @param num number
     */
    public Manager(String num) {
           super("ali",12,500);
    }

    /**
     * default Empty constructor
     */
    public Manager() {

    }

    /**
     * Set name of manager
     *
     * @param name name of manager
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get name of manager
     *
     * @return name of manager
     */
    public String getName(){
        System.out.println("the name of manager is "+name);
        return name;
    }

    /**
     * Grade of an employee
     *
     * @param scale Grade of an Employee
     */
    public void setGrade(int scale) {
        this.scale = scale;
    }

    /**
     * Get scale/Grade of an employee
     */
    void getGrade(){
        System.out.println("the scale of Manager is "+scale);
    }
}
