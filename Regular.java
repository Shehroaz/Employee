package com.sherry;

public class Regular extends Staff {

    /**
     * Default empty constructor for Regular class
     */
    public Regular(){ }
    public void staffSalary(){
        System.out.println("the staff is off regular basis ");
    }

    /**
     * calculate monthly salary
     * @param wage per hour rate
     * @return monthly salary
     */
   public int monthlySalary( int wage) {
        return super.calculateSalary(198,wage);
   }
}
