public class Main_2 {
    public static void main(String[] args) {
        int[] nums = { 0, 3, 2, 0, 8 ,5};

        //0,0,3,2,8,5

        int n = nums.length;
        int index = n-1; //5번방부터 들어가는거예요

        for(int i = n-1; i>=0; i--){
            if(nums[i]!=0){
                nums[index] = nums[i];
                index--;
            }
        }

        while(index >= 0){
            nums[index] = 0;
            index--;
        }

        for(int i : nums){
            System.out.println("i :"+i);
        }
    }
}
