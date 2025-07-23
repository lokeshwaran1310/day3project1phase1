package models;

import interfaces.Taxable;
public class FullTimeEmployee extends Employee implements Taxable {
    private double sal;

    public FullTimeEmployee(String name, double sal) {
        super(name);
        this.sal = sal;
    }

    public double getSal() {
        return sal;
    }

    @Override
    public double calculatesalary() {
        return sal;
    }

    @Override
    public double calculateTax() {
        return sal * 0.2; // Assuming a tax rate of 20% for full-time employees
    }
}