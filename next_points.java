public class next_points {
    public static int[][] find_and_mark_next_point(int [][] arr, int x, int y) {
        if (arr [x-1][y] == 0){
            arr[x-1][y] = arr [x][y] + 1;
        }
        if (arr [x][y+1] == 0){
            arr[x][y+1] = arr [x][y] + 1;    
        }
        if (arr [x+1][y] == 0){
            arr[x+1][y] = arr [x][y] + 1;    
        }
        if (arr [x][y-1] == 0){
            arr[x][y-1] = arr [x][y] + 1;    
        }
        return arr;
    }
    
}
