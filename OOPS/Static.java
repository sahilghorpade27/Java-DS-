public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolname = "aps" ;

        Student s2 = new Student() ;
        System.err.println(s2.schoolname);
        
    }
}

class Student {
    int roll ;
    static String schoolname ;


}
