package day52_Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {
    public static void main(String[] args) {

        Queue<String> q = new PriorityQueue<>();

        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");

        String s1 = q.poll(); //A
        System.out.println(s1);// A
        System.out.println(q); // [B, D, C]


    }
}
