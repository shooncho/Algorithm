public class Main_1 {
    public static void main(String[] args) {
        //1
        int[] nums = { 0, 3, 2, 0, 8 ,5};

        //3,2,8,5,0,0
        //0,0,3,2,8,5

        //2.for
        //array + 0 index
        int n = nums.length; //6  , 방 번호할때는 -1 해야함
        //array index와 뽑아서 써칭하는거에대한 기본적인 문제예요
        int index = 0;
        //3,2,8,5
        for(int i = 0 ; i < n; i++){
            if(nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
        }

        while(index < n){ //6이니까 5까지 가는거예요 방번호는 -1
            nums[index] = 0;
            index++;
        }

        for(int i : nums){
            System.out.println("i " + i);
        }
    }
}
