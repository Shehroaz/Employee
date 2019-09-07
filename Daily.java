package com.sherry;

public class Daily <T> extends Staff {
    T sal;
    public void dailySalary(){
        System.out.println("this is daily basis staff ");

    }
    T salary(T sal){
        return sal;

    }
    public int monthlySalary( int hour,int wage) {
        return super.calculateSalary(hour,wage);


    }
}
