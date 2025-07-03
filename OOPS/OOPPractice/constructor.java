package OOPPractice;

public class constructor {
     public static void main(String[] args) {
        Student s1 = new Student("Sahil", 2);
     }
}

class Student {
    String name ;
    int rollno ;

    Student(String name , int roll){
        this.name = name ;
        this.rollno = rollno ;

        System.out.println("Constructor called with name and roll "+name+" "+rollno);
    }
}
