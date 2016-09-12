package com.thoughtworks.corejava.collections;

import java.util.HashMap;

public class StudentHashMap {

    public HashMap<Integer, Student> buildStudentMap(Student[] students){
        HashMap<Integer, Student> studentMap = new HashMap<>();
        for(Student student : students){
            studentMap.put(student.getId(), student);
        }
        return  studentMap;

    }
    public static void main(String[] args) {
        Student a = new Student(1, "Tom");
        Student b = new Student(2, "Bill");
        HashMap<Integer, Student> myMap = new StudentHashMap().buildStudentMap(new Student[]{a,b});
        assert myMap.size() == 2;
        assert myMap.get(1).equals(a);
    }
}
