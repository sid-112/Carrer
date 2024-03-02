package com.DSa;
import java.util.*;

public class Priority_ques {
    public static void main(String[] args) {
        Queue<Double> qp = new LinkedList<>();

        qp.offer(3.0);
        qp.offer(4.0);
        qp.offer(6.7);
        qp.offer(3.9);
        qp.offer(1.3);

        while (!qp.isEmpty()){
            System.out.println(qp.poll());
        }

        System.out.println("------------------------------------------------------------------");
        Queue<Double> pl = new PriorityQueue<>(Collections.reverseOrder());

        pl.offer(3.0);
        pl.offer(4.0);
        pl.offer(6.7);
        pl.offer(3.9);
        pl.offer(1.3);

        while (!pl.isEmpty()){
            System.out.println(pl.poll());
        }

    }
}
