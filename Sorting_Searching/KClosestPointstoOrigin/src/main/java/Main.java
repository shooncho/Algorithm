import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // 1. 원점으로 부터의 거리를 구한다.
        // 2. (x2-x1)^2 +(y2-y1)^2
        // 3. 원점에서 제일 작은 거리에 있는 값을 구한다.
        // 제일 작은값부터 저장(PriorityQueue 이용한다)
        //   8
        // 10  12 이렇게 오면 앞에 2개리턴 1개리턴 이렇게하면되겠죠??
        // PriorityQueue에 원점 거리 작은거 부터 저장 즉 MinHeap
        // Queue<int[]> pq = new PriorityQueue<>((a,b)->
        // (a[0]*a[0]+a[1]*a[1]) - (b[0]*b[0]+b[1]*b[1]));
        // 2. K개 만큼 큐에서 poll해서 int[][] 타입으로 전달
        
        Main a = new Main();
        int[][] points = {{1,3}, {-2,2}};
        int k = 1;
//        int[][] points = {{3,3}, {5,-1}, {-2,4}};
//        int k = 2;
        int[][] result = a.solve(points, k);
        a.print(result);
    }

    private void print(int[][] result) {
        int m = result.length;
        int n = result[0].length;
        for(int i = 0; i< m; i++){
            for( int j = 0; j < n; j++){
                System.out.print(" [" +i + "][" + j + "] " + result[i][j]);
            }
            System.out.println();
        }
    }

    private int[][] solve(int[][] points, int k) {
        //1. ds
        Queue<int[]> pq = new PriorityQueue<>((a,b)->
                (a[0]*a[0]+a[1]*a[1]) - (b[0]*b[0]+b[1]*b[1]));
        int[][] res = new int[k][2]; // k==1

        //2. for while
        for(int[] p : points){
            pq.offer(p); // 8 -> 10 으로 되어 있는거예요
//            if(pq.size() > k)
//                pq.poll();
        }

        int index = 0;
        while(index < k) {
            res[index] = pq.poll(); // 2차원 배열에 0번방에 넣으면 되는거겠죠?? pq에서 가져온 애를
            index++;
        }
        return res;
    }
}
