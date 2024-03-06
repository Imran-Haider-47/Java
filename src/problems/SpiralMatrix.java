package problems;

public class SpiralMatrix {
    int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

    int left = 0;
    int top = 0;
    int right = matrix[0].length;
    int bottom = matrix[0].length ;

    int size1 = right * bottom;
    int direction = 0;
    int temp =0;
    public void spiralMatrix(){
        for(int i = 0 ; i < size1; i++ ){

        if(direction==0) {
            System.out.println(matrix[top][temp]);
            temp++;
        }
        if(temp==right){
            direction++;
            temp--;
        }
        if(direction==1){
            
        }

        }
    }



}
