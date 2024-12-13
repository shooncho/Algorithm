public class Main {
    public static void main(String[] args) {
        //1. 값이 0이 아닌값을 먼저 array에 담는다
        //2. Index를 기억한다
        //3. 해당 index에 0인 값을 넣는다

        //1. ds, 저장 공간이 따로 안필요함 왜냐 저걸 그대로 넣을거니까
        int[] nums = {0, 3, 2, 0, 8, 5};
        //2가지 방법을 할건데
        // 3,2,8,5,0,0


        //2. for
        //array 앞뒤로 넘기는거 그리고 0에대한 index 값
        int n = nums.length; //6, index-1 방번호할때는 -1 해야함
        int index = 0;

        for(int i=0; i<n; i++){
            if(nums[i]!=0) { // 0이 아닌건 빼야하니까
                // 3,2,8,5 를 담은거죠??
                nums[index] = nums[i];
            }
        }
        //3,2,8,5,0,0
        while(index < n) { //6이니까 5까지만 가는거고 index자체는 -1 해줘야해요
            nums[index] = 0;
            index++;
        }




            // 0,0,3,2,8,5

        for(int i : nums)
            System.out.println("i "+i);
    }
}
