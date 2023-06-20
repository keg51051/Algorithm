package day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Lab11 {
    public static void main(String[] args) {
        ArrayList<Integer> arr[] = new ArrayList[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = new ArrayList();
        }

        // 1과 2 연결
        arr[1].add(2) ;
        arr[2].add(1) ;
        // 1과 3 연결
        arr[1].add(3) ;
        arr[3].add(1) ;
        // 2와 3연결
        arr[2].add(3) ;
        arr[3].add(2) ;
        // 2와 4연결
        arr[2].add(4) ;
        arr[4].add(2) ;
        // 2와 5연결
        arr[2].add(5) ;
        arr[5].add(2) ;
        // 3와 6연결
        arr[3].add(6) ;
        arr[6].add(3) ;
        // 3와 7연결
        arr[3].add(7) ;
        arr[7].add(3) ;
        // 4와 5연결
        arr[4].add(5) ;
        arr[5].add(4) ;
        // 6와 7연결
        arr[6].add(7) ;
        arr[7].add(6) ;

        bfs(arr);

    }

    public static void bfs(ArrayList<Integer> arr[]) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[arr.length];
        queue.add(1);

        while(!queue.isEmpty()) {
            ArrayList<Integer> output = arr[queue.peek()];
            System.out.println(queue.peek());
            visited[queue.peek()] = true;

            for (int i = 0; i < output.size(); i++) {
                if (!visited[output.get(i)]) {
                    queue.add(output.get(i));
                    visited[output.get(i)] = true;
                }
            }
            queue.poll();
        }
    }
}
