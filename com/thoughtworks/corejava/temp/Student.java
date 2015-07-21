package com.thoughtworks.corejava.temp;

/**
 * Created by rajatbhatnagar on 6/23/15.
 * Checks your ubderstanding of the output frin == and equals
 */
public class Student implements Comparable<Student>{
    private String name;
    private int rollNum;

    public String getName() {
        return name;
    }

    public Student(String name, int rollNum) {
        this.name = name;
        this.rollNum = rollNum;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNum=" + rollNum +
                '}';
    }

    //Overriding the equals method in this class
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student student = (Student)obj;
            return this.rollNum == student.rollNum && this.name.equals(student.name);
        }
        return false;
    }

    public static void main(String[] args) {
        //Creating two identical objects
        Student student = new Student("Hari",21);
        Student student1 = new Student("Hari",21);
        //Question - What is student == student1 and student.equals(student1)
        System.out.print(" student == student1  :: ");
        System.out.println(student == student1);
        System.out.print(" student.equals(student1)  :: ");
        //This will return true because we have  overridden equals methods in this class
        System.out.println(student.equals(student1));
        //This will return false if  equals method is not overridden in this class,
        //because then the behavior is identical to implementation of equals method in Object class
    }

    @Override
    public int compareTo(Student studentObj) {
        /*if(this.rollNum<studentObj.rollNum){
            return -1;
        }else if (this.rollNum>studentObj.rollNum){
            return  +1;
        }else {
            return 0;
        }*/
        //The above three lines can be replaced by a single below as we are just interested in a positive, negative
        // or a zero value which is returned
        return this.rollNum - studentObj.rollNum;
    }
}
