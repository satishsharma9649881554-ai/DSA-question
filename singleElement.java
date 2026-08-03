public class singleElement {

    public static int element(int nums[]){
        int n = nums.length;
        if(n == 1){  //case 1
            return nums[0];
        }
       int st = 1;
       int end = n-2;
       while(st<=end) {
        int mid = (st+end)/2;
        if(mid == 0 && nums[0] != nums[1]){  //case 2
            return nums[mid];
        }

        if(mid == n-1 && nums[n-1] != nums[n-2]){  //case 3
            return nums[mid];
        }
        if(nums[mid-1] != nums[mid] && nums[mid] != nums[mid+1]){
            return nums[mid];
        }

        if(mid % 2 == 0){  //even
        if(nums[mid-1] == nums[mid]){
            end = mid-1;
        }else{
            st = mid + 1;
        }

        
       }else{
        if(nums[mid+1] == nums[mid]){
            st = mid + 1;
        }else{
            end = mid - 1;
        }
       }
    }
    return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,2,3,3,4,4,8,8};
        int ans = element(nums);
        System.out.println(ans);

    }
    
}
