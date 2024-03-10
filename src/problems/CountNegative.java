package problems;

public class CountNegative {
    int[][] grid = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
    };

    public int solution(){
        int totalColumns = grid[0].length;
        int row = grid.length-1;
        int col=0;
        int result = 0;
        while(row>=0 && col < totalColumns){
            if(grid[row][col]>=0){
                col++;
            }
            else{
                result+= totalColumns - col;
                row--;
            }
        }
        return result;

    }
}
