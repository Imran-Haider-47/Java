package problems;

public class PivotInteger {
    int n= 8;

    public int solution(){
        int sum = n*(n+1)/2;
        int x = n/2;
        while(x<n){
            if(x== Math.sqrt(sum)){
                return x;
            }
            else{
                x++;
            }
        }
        return -1;
    }
}
