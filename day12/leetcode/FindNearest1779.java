package leetcode;

public class FindNearest1779 {
    
    public int nearestValidPoint(int x, int y, int[][] points) {
        
        int rowlength = points.length;

        int mindistance = Integer.MAX_VALUE;
        int minposition = -1;

        for(int i=0;i<rowlength;i++){
            int x1 = points[i][0];
            int y1 = points[i][1];
            if( x1 == x || y1 == y){
                
                int xvalue = (x-x1);
                if(xvalue < 0){
                    xvalue *= -1;
                }

                int yvalue = (y-y1);
                if(yvalue < 0){
                    yvalue *= -1;
                }

                int diff = xvalue + yvalue;

                if(mindistance > diff){
                    mindistance = diff;
                    minposition = i;
                }
            }
        }

        return minposition;
    }
}
