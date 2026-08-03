import java.util.Arrays;

public class sorting {
 public static int [] sort(int nums[]){
    int n = nums.length;
    int count0 = 0;
    int count1 = 0;
    int count2 = 0;

    for(int i=0; i<n; i++){
        if(nums[i] == 0){
            count0++;
        }else if(nums[i]==1) {
            count1++;
        }else{
            count2++;
        }
      
    }
    
    int idx = 0;
    for(int i=0; i<count0; i++){
        nums[idx++] = 0;
     }
      for(int j=0; j<count1; j++){
        nums[idx++] = 1;
     }
      for(int k=0; k<count2; k++){
        nums[idx++] = 2;
     }
     return nums;
 }
 
 public static void main(String[] args) {
    int nums[] = {1,0,2,0,1,2,0,1};
    int result[] = sort(nums);
    System.out.println(Arrays.toString(result));
 }
}