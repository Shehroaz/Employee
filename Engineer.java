package com.sherry;

public class Engineer extends Employee {

    /**
     * Empty constructor for engineer class
     */
    public Engineer() {
    }

    /**
     * Constructor with name
     * @param num
     */
    public Engineer(String num) {
        super("ali", 12, 500);
    }

    /**
     * Get name of an Engineer
     *
     * @return name of an Engineer
     */
    @Override
    public String getName() {
        return "MR ." + super.name;
    }
}