import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main_1 {
    public static void main(String[] args) {
        Main_1 a = new Main_1();
        int[] nums = {2,3,1,5,6,4};
        int k = 2;
//        int[] nums = { 3,2,3,1,2,4,5,5,6};
//        int k =4;
        System.out.println(a.solve(nums, k));
        System.out.println(a.solve_pq(nums, k));
    }

    private int solve(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int n = nums.length; //6
        return nums[n-k]; // 1,2,3,4,5,6 즉 4번방 찾으면 되는거잖아요
    }

    private int solve_pq(int[] nums, int k) {
        //1
        // nums 배열을 빼 오니까 Integer
        //PriorityQueue는 asc minHeap

        Queue<Integer>  pq = new PriorityQueue<>(); // 우선순위 큐 O(log(n)) 시간 걸리고
        // pq.add() , pq.offer() 는 우선 순위대로 데이터 삽입 (즉 1,2,3,4, 정렬된다는 뜻)
        // pq.poll(), pq.remove() 는 우선수위가 가장 높은 값 제거
        // pq.size() 는 PriorityQueue의 크기 즉 개수를 구할 수 있음
        // pq.peek() 는 우선순위가 가장 높은 값 출력
        //2
        for(int i : nums){
            pq.offer(i);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }


}
