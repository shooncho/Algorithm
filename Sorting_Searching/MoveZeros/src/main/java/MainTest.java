import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        int[] nums = { 0, 3, 2, 0, 8 ,5};

        int len = nums.length; //6 , index = 5
        int index = 0;
        for(int i=1; i<len;i++) { // index 5개니까
            if(nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
        }
        while(index < len){ //0,1,2,3,4,5
            nums[index] = 0;
            System.out.println(nums[index]);
            index++;
        }

        for(int i : nums)
            System.out.println("i : "+i);
        System.out.println(Arrays.toString(nums));
    }

}
