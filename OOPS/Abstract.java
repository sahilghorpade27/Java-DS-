public class Abstract {
    public static void main(String[] args) {
        horse h = new horse();
        h.walk();
        chicken c = new chicken();
        c.walk();
        c.eats();
        
    }
}
abstract class Animal{
    void eats(){
        System.out.println("animal eats");
    }
    abstract void walk() ;
}

class horse extends Animal {
    void walk(){
        System.out.println("Animal walks");
    }
}

class chicken extends Animal {
    void walk(){
        System.out.println("chichken walks");
    }
}
