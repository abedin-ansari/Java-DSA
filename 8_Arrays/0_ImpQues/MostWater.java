// Given N non-negative Integers a[0], a[1], ..... a[n-1] where each represents the point at 
// (i, a[l]) these n vertical lines are drown auch that the two endpoints of line i is at (0, i)
// and (a[i], i).
// Find two lines which together with x-axis form a container such that the coontainer contains
// the most water. the program should return an integer which corresponds to the maximum area of
// water that can be contianed. NOTE-> You can slant the container

public class MostWater {
    public static int maxArea(int[] height){
        // 2nd Solution
        int area = 0;
        int i=0, j = height.length-1;
        while( i<j ){
            int w = j-i;
            int h = Math.min(height[i], height[j]);
            int calcArea = w*h;
            if(calcArea > area){
                area = calcArea;
            }
            if(height[i] < height[j]){ // IMP**
                i++;
            } else{
                j--;
            }
        }

        // 1st Solution
        // int area = 0;
        // for(int i = 0; i<height.length; i++){
        //     for(int j= i+1; j< height.length; j++){
        //         int w= j-i;
        //         int h = Math.min(height[i], height[j]);
        //         int CalcArea = w*h;
        //         if(CalcArea > area){
        //             area = CalcArea;
        //         }
        //     }
        // }
        return area;
    }
    public static void main(String[] args) {
        int[] height = {1,5,4,3};
        System.out.println(maxArea(height));
    }
}
