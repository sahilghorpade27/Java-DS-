class Basic {
    public static void main(String[] args) {
        Pen p1 = new Pen(5,"yellow");
        // p1.setTip(5);
        // p1.setcolor("Blue");
        System.out.println(p1.getcolor());
        System.err.println(p1.gettip());
    }
}

// class Pen{
//      private String color ;
//      private int tip ;

//      Pen(){
//         System.out.println("constructor called ");
//      }

//      int gettip(){
//         return this.tip ;
//      }

//      String getcolor(){
//         return this.color ;
//      }

//      void setcolor(String newcolor){
//         color = newcolor ;
//      }
//      void setTip(int newtip){
//         tip = newtip ;
//      }
// }

class Pen{
    private String color ;
    private int tip ;

    Pen(int tip , String color){
       System.out.println("constructor called ");
       this.color = color ;
       this.tip = tip ;
    }
    int gettip(){
        return this.tip ;
    }
        
    String getcolor(){
        return this.color ;
    }

}