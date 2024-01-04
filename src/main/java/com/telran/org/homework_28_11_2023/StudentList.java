package com.telran.org.homework_28_11_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.telran.org.homework_28_11_2023.ClassType.*;

public class StudentList {

    public static void main(String[] args) {

// # 4 Task
        Student studentBE1 = new Student("Ryan", 4.5, true, ClassType.BA);
        Student studentBE2 = new Student("Tom", 4.0, true, ClassType.BA);
        Student studentBE3 = new Student("Steven", 3.5, false, ClassType.BA);
        Student studentBE4 = new Student("Mary", 4.5, false, ClassType.BA);
        Student studentBE5 = new Student("John", 5.0, true, ClassType.BA);

        List<Student> studentBackEndList = Arrays.asList(studentBE1, studentBE2, studentBE3, studentBE4, studentBE5);

        Student studentFE1 = new Student("Mike", 3.0, false, ClassType.FE);
        Student studentFE2 = new Student("Joe", 3.5, false, ClassType.FE);
        Student studentFE3 = new Student("Mishel", 4.5, true, ClassType.FE);
        Student studentFE4 = new Student("Kohl", 5.0, true, ClassType.FE);
        Student studentFE5 = new Student("Diane", 4.5, true, ClassType.FE);

        List<Student> studentFrontEndList = Arrays.asList(studentFE1, studentFE2, studentFE3, studentFE4, studentFE5);

        Student studentQA1 = new Student("Tamila", 4.5, true, QA);
        Student studentQA2 = new Student("Eve", 4.5, true, QA);
        Student studentQA3 = new Student("Stone", 4.5, false, QA);
        Student studentQA4 = new Student("Denice", 3.5, false, QA);
        Student studentQA5 = new Student("Samuel", 5.0, true, QA);

        List<Student> studentQualityAssuranceList = Arrays.asList(studentQA1, studentQA2, studentQA3, studentQA4, studentQA5);
// # 5 Task
        System.out.println();
        List<Student> studentList = new ArrayList<>();
        studentList.addAll(studentBackEndList);
        studentList.addAll(studentFrontEndList);
        studentList.addAll(studentQualityAssuranceList);

        System.out.println("Student List whose rate is more 4.5 and who finished course are:");
        studentList.stream()
                .filter(student -> student.getRate() > 4.5 && student.isFinished())
                .forEach(student -> {
                    if (student instanceof BackEndStudent) {
                        student.setType(ClassType.BA);
                    } else if (student instanceof FrontEndStudent) {
                        student.setType(ClassType.FE);
                    } else if (student instanceof QAStudent) {
                        student.setType(ClassType.QA);
                    }
                    System.out.println(student);
                });
// # 6 Task
        System.out.println();
        List<ProjectStudent> projectStudents = studentList.stream()
                .filter(student -> student.getRate() > 4.5 && student.isFinished())
                .map(student -> {
                    ProjectStudent projectStudent = new ProjectStudent();
                    projectStudent.setName(student.getName());
                    projectStudent.setRate(student.getRate());
                    projectStudent.setFinished(student.isFinished());
                    projectStudent.setType(student.getType());
                    if (student instanceof BackEndStudent) {
                        projectStudent.setType(BA);
                    } else if (student instanceof FrontEndStudent) {
                        projectStudent.setType(FE);
                    } else if (student instanceof QAStudent) {
                        projectStudent.setType(QA);
                    }
                    return projectStudent;
                })
                .collect(Collectors.toList());

        System.out.println("Information about the Project Students:");
        projectStudents.forEach(System.out::println);
    }
}