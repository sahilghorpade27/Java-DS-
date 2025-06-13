public class methodoveriding {
    

    public static void main(String[] args) {
        deer d = new deer() ;
        d.eats();
    }

}

class Animal {
    void eats(){
        System.out.println("Eats anything");
    }
}
class deer extends Animal {
    void eats(){
        System.out.println("Eats grass");
    }
}
