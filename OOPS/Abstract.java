public class Abstract {
    public static void main(String[] args) {
        horse h = new horse();
        h.walk();
        h.eats();
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

    Animal(){
        System.out.println("abstract clsss constructor");
    }
}

class horse extends Animal {
    void walk(){
        System.out.println("horse walks");
    }
}

class chicken extends Animal {
    chicken(){
        System.out.println("Chicken constructor called");
    }
    void walk (){
        System.out.println("chichken walks");
    }
}
