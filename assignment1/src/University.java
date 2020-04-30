import java.awt.image.PackedColorModel;
import java.util.*;

// - add student
// - remove student
// - view students
// - login

public class University {
    private LinkedList<Subject> subjects = new LinkedList<Subject>();
    private LinkedList<Student> students = new LinkedList<Student>();

    public University(){
        Subject ap = new Subject();
        ap.addActivity("Lec1", 1, "Monday", 9, 1, "14b", 200);
        subjects.add(ap);
    }

    public static void main(String[] args){
        University university = new University();
        university.use();
    }

    public void login(){
        String number = (readStudent());
        Student student = student(number);
        if (student != null)
            student.use();
        else
            System.out.println("Invalid student number");
    }

    private void addStudent(){
        Student student = new Student();
        Student exists = student(student.getNum());
        if (exists == null)
            students.add(student);
        else
            System.out.println("Student number already exists");
//        students.add(student);

        //        students.add(new Student(readNum(), readName()));

//        Student student
//        System.out.println("enter a student: ");
//        this.students.add(student);
    }

    private Student student(String number){
        for (Student student : students)
            if (student.hasNum(number))
                return student;
        return null;
    }

    public void removeStudent(){
        String number = (readStudent());
        Student student = student(number);
        if (student != null)
            students.remove(student);
        else
            System.out.println("Student doesn't exist");
    }

    private String readStudent(){
        System.out.print("enter student ID: ");
        String student = In.nextLine();
        return student;
    }


    private void view(){
        for (Student student : students )
            System.out.println(student);
    }

    public void use() {
        char choice;
        while ((choice = readChoice()) != 'x' ) {
            switch (choice) {
                case 'a': addStudent(); break;
                case 'r': removeStudent(); break;
                case 'v': view(); break;
                case 'l': login(); break;
                default: help(); break;
            }
        }
        System.out.println("Done");
    }

    private char readChoice() {
        System.out.print("Choice (a/r/v/l/x): ");
        return In.nextChar();
    }


    private void help() {
        System.out.println("University menu options");
        System.out.println("a = add a student");
        System.out.println("r = remove a student");
        System.out.println("v = view all students");
        System.out.println("l = login");
        System.out.println("x = exit");
    }

//    private Subject selectSubject() {
//        return subject;
//    }

//    public Subject subject(int number) {
//        return number;
//    }

    private String readStudentNumber() {
        System.out.print("Number: ");
        return In.nextLine();
    }

    private String readStudentName() {
        System.out.print("Name: ");
        return In.nextLine();
    }

    private int readSubjectNumber() {
        System.out.print("Enter subject number: ");
        return In.nextInt();
    }


}
