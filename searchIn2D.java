public class searchIn2D {

    public static boolean searchMidrow(int matrix[][],int target,int midRow) {
        int k = matrix[0].length;
        int strow = 0;
        int edrow = k-1;

        while(strow<=edrow){
            int mid = strow+(edrow - strow);
            if(matrix[midRow][mid] == target) {
                return true;
            }else if(matrix[midRow][mid] >= target){
                 edrow = mid - 1;
            }else{
                strow = mid + 1;
            }

            
        }
        return false;


    }

    public static boolean search2Dmatrix(int matrix[][],int target){  // use binary search for tc = 0(log(m*n))
          int  endRow= 3;
        int n = 4;
        int startRow = 0;
       int endcol = matrix[0].length-1;
       while(startRow<=endRow){
        int midRow = startRow + (endRow - startRow)/2;

        if(target>=matrix[midRow][0] && target <= matrix[midRow][endcol]){
            return searchMidrow(matrix,target,midRow);

        }else if(target >= matrix[midRow][0]){
            startRow = midRow + 1;
        }else{
            endRow = midRow - 1;
        }
       }
       return false;

    }
    public static void main(String[] args) {
      
        int target = 31;
        int matrix [][] = {
                                  {1,3,5,7},
                                   {10,11,16,20},
                                   {23,30,34,60}
                                     };

        boolean ans = search2Dmatrix(matrix, target);
        System.out.println(ans);
   
    }
}
