package solution200_299;

/**
 * Created by zjw on 2017/10/30.
 */
public class P240_Search2DMatrix {

    // from leetcode discussion
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0]== null || matrix[0].length == 0)
            return false;
        int row = 0, col = matrix[0].length - 1;
        while(col >= 0 && row < matrix.length) {
            if(matrix[row][col] == target)
                return true;
            else if(matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

}
