public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolname = "aps" ;

        Student s2 = new Student() ;
        System.out.println(s2.schoolname);

        sum add1 = new sum();
        add1.a = 1 ;
        add1.b = 2 ;

        sum add2 = new sum() ;
        add2.a = 2 ;
        add2.add();
        
    }
}

class Student {
    int roll ;
    static String schoolname ;


}

class sum {
    int a ;
    static int b ;

    void add (){
        System.out.println(a+b);
    }

}