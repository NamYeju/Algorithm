package Algorithm.src.개념.큐;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String args[]){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(7); // == queue.offer(3)
        queue.add(5);
        queue.add(4);
        queue.poll();
        queue.add(6);
        queue.poll();
        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.poll();
        }
        return;
    }
}
