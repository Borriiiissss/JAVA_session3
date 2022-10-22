public class create_array{
    public static int [][] cr_ar (int x, int y){
        int [][] arr = new int [x+2][y+2];
        for (int i = 0; i < x+2; i++) {
            arr [i] [0] = -1;
            arr [i] [y+1] = -1;
        }
        for (int i = 0; i < y+2; i++) {
            arr [0] [i] = -1;
            arr [x+1] [i] = -1;
        }
        int wall_x = (int) (Math.random() * (x - 1)) + 3;
        for (int i = 4; i < x - 3; i++) {
            arr [i] [wall_x] = -1;
            arr [wall_x] [i] = -1;
        }
        int entrance = 0;
        do {entrance = (int) (Math.random() * ( x - 1 )) + 1;}
            while (entrance < 1);
        int exit = (int) (Math.random() * ( y - 1 )) + 1;
        next_points.find_and_mark_next_point(arr, entrance, 1);
        arr [entrance][1] = -2;
        arr [exit] [y] = -3;
        print_array.pr_ar(arr);         
        return arr;       
    }
}