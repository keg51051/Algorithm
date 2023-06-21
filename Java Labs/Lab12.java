package day07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Lab12 {
    static int[][] maze, distance;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        maze = new int[7][7];
        distance = new int[7][7];

        for(int i=0; i<7; i++) {
            String str = br.readLine();
            for(int j=0; j<7; j++) {
                char ch = str.charAt(j);
                maze[i][j] = Character.getNumericValue(ch);
            }
        }

        bfs(0, 0);
        if (distance[6][6] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(distance[6][6]);
        }
    }

    static void bfs(int x, int y) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(x, y));
        maze[x][y] = 1;

        while (!q.isEmpty()) {
            Pair temp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];
                if (nx >= 0 && nx <= 6 && ny >= 0 && ny <= 6 && maze[nx][ny] == 0) {
                    maze[nx][ny] = 1;
                    q.add(new Pair(nx, ny));
                    distance[nx][ny] = distance[temp.x][temp.y] + 1;
                }
            }
        }
    }
}

class Pair {
    public int x, y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
