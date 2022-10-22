public class moving {
    public static int [][] mov_through(int [][] arr) {
        int free_places = 1;
        int count = 0;        
        while (free_places == 1){
            count ++;
            free_places = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++){
                    if (arr[i][j] == 0){ free_places = 1;}
                    if (arr[i][j] > 0 && arr [i][j] == count){
                        next_points.find_and_mark_next_point(arr, i, j);
                    }
                }               
            }
        }   
        return arr;   
    }    
}
