import java.util.* ;

public class Basic {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        // To compare the objects based on rank
        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        // PriorityQueue <Integer> pq = new PriorityQueue<>();
        // PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // pq.add(3);
        // pq.add(4);
        // pq.add(7);
        // pq.add(1);

        PriorityQueue <Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 3));
        pq.add(new Student("B", 1));
        pq.add(new Student("C", 4));
        pq.add(new Student("D", 2));

        while(! pq.isEmpty()){
            System.out.println(pq.peek().name +" -> "+ pq.peek().rank);
            pq.remove();
        };
    }
}