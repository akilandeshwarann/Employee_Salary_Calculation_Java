//package Employee;
import java.io.*;
public class Employee implements Serializable {
    private int id;
    private String name;
    private String designation;
    private double basicSalary;
    private double allowances;
    private double taxRate;
    private double providentFundRate;
    public Employee(int id, String name, String designation, double basicSalary, double allowances, double taxRate, double providentFundRate) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
        this.taxRate = taxRate;
        this.providentFundRate = providentFundRate;
    }
    public int getId() {
        return id;
    }
    public double calculateGrossSalary() {
        return basicSalary + allowances;
    }
    public double calculateDeductions() {
        double tax = calculateGrossSalary() * (taxRate / 100);
        double providentFund = basicSalary * (providentFundRate / 100);
        return tax + providentFund;
    }
    public double calculateNetSalary() {
        return calculateGrossSalary() - calculateDeductions();
    }
    public String toString() {
        return "ID: " + id +
               "\nName: " + name +
               "\nDesignation: " + designation +
               "\nBasic Salary: " + basicSalary +
               "\nAllowances: " + allowances +
               "\nGross Salary: " + calculateGrossSalary() +
               "\nDeductions: " + calculateDeductions() +
               "\nNet Salary: " + calculateNetSalary();
    }
}
