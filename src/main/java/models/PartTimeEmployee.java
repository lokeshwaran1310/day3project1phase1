package models;

import interfaces.Taxable;

public class PartTimeEmployee extends Employee implements Taxable{
    private int hr;
    private double sal;
    public PartTimeEmployee(String name,int hr,double sal){
        super(name);
        this.hr=hr;
        this.sal=sal;
    }
    public int getHr() {
        return hr;
    }

    public double getSal() {
        return sal;
    }
    @Override
    public double calculatesalary(){
        return getHr()*sal;
    }

    @Override
    public double calculateTax() {
        return (calculatesalary() * 0.1); // Assuming a tax rate of 10% for part-time employees
    }



   
    
}
