package com.sherry;

public class TeamLeader extends Employee {

    /**
     * Default empty constructor of an employee
     */
    public TeamLeader() {

    }

    /**
     * construtor of the teamLeader
     *
     * @param name name of the teamLeader
     * @param id  ID of the teamLeader
     * @param salary Salary of the teamLeader
     */
    public TeamLeader(String name,int id,float salary) {
        super(name,id,salary);

    }

    /**
     * Getting name of teamLeader
     */
    public void teamLeader(){
        System.out.println("the team leader should lead the team "+ super.getName());
    }
}
