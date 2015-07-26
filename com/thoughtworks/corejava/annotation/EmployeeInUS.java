package com.thoughtworks.corejava.annotation;

/**
 * Created by rajatbhatnagar on 7/26/15.
 * This class is a placeholder so that we can apply our custom annotation EmployeeDetailsCustomClassLevelAnnotation
 * and fetch the details in the implementation class for EmployeeInUS later
 */

//Applying custom annotation to class
@EmployeeDetailsCustomClassLevelAnnotation(employeeName = "Mike", employeeLocation = "Hartford", employeeSalary = 90000)
public class EmployeeInUS {
    private String empName;
    private String empLOC;
    private int empSal;
    private String empProgrammingSkill;

    public EmployeeInUS(String empName, String empLOC, int empSal, String empProgrammingSkill) {
        this.empName = empName;
        this.empLOC = empLOC;
        this.empSal = empSal;
        this.empProgrammingSkill = empProgrammingSkill;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpLOC(String empLOC) {
        this.empLOC = empLOC;
    }

    public void setEmpSal(int empSal) {
        this.empSal = empSal;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpLOC() {
        return empLOC;
    }

    public int getEmpSal() {
        return empSal;
    }

    public void setEmpProgrammingSkill(String empProgrammingSkill) {
        this.empProgrammingSkill = empProgrammingSkill;
    }

    @EmployeeDetailsCustomMethodLevelAnnotation
    public String getEmpProgrammingSkill() {

        return empProgrammingSkill;
    }

}
