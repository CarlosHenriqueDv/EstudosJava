package br.com.estudojava.devdojomaratonajava.Zcolecoes.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();

        queue.add("C");
        queue.add("D");
        queue.add("A");
        queue.add("B");

        System.out.println(queue.peek());

    }
}
