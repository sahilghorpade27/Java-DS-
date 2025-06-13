public class Interface {
    public static void main(String[] args) {
        queen q = new queen() ;
        q.moves();
    }
}

interface Chessplayer {
    void moves();
}

class queen implements Chessplayer {
    public void moves(){
        System.out.println("up , left , cross ,down , right");
    }

}

class Rook implements Chessplayer {
    public void moves(){
        System.out.println("up , left , down , right");
    }

}

class King implements Chessplayer {
    public void moves(){
        System.out.println("up , left , cross ,down , right");
    }

}