package com.kit.center.runners.classwork.polymorphizm.inhairitance;


import com.kit.center.app.classwork.polymorphizm.inhairitance.Person;
import com.kit.center.app.classwork.polymorphizm.inhairitance.Student;
import com.kit.center.app.classwork.polymorphizm.inhairitance.Teacher;
import com.kit.center.app.classwork.polymorphizm.inhairitance.Worker;

public class PersonRunner {


    public static void main(String[] args) {
    Person student = new Student("Sergii");
    System.out.println(student);
    //System.out.println(student.getResponse("What is class?"));
    Person teacher = new Teacher("Teacher");
    //System.out.println(teacher.getResponse("What time is now?"));
    Person worker = new Worker("Viktor");
    //System.out.println(worker.getResponse("Wtf?"));
    showResponse(student, "What class is it");
    showResponse(teacher, "What time is now?");
    showResponse(worker, "Im worker man");
    }

    public static void showResponse (Person person, String question){
        System.out.println(person.getResponse(question));
    }
}
