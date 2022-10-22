import java.util.ArrayList;
import java.util.Collections;

public class way_back {
    public static void find_the_way(int[][] arr) {
        int x = 0, y = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == -3){
                    x = i;
                    y = j;
                }
            }
        }
        ArrayList<Integer> tmp_arr = new ArrayList<Integer>();
        if(arr [x-1][y] > 0) tmp_arr.add (arr [x-1][y]); 
        else tmp_arr.add(100000); 
        if(arr [x][y+1] > 0) tmp_arr.add (arr [x][y+1]);
        else tmp_arr.add(100000);
        if(arr[x+1][y] > 0) tmp_arr.add (arr [x+1][y]);
        else tmp_arr.add(100000);
        if(arr[x][y-1] > 0) tmp_arr.add (arr [x][y-1]);
        else tmp_arr.add(100000);
        int min = Collections.min(tmp_arr) + 1;
        int moves_left = min;
        do{
            int turn_up = arr [x-1][y];
            int turn_right = arr [x][y+1];
            int turn_down = arr [x+1][y];
            int turn_left = arr [x][y-1]; 
            if (turn_up < min && turn_up > 0 ){
                min = turn_up;
                x = x-1;
                System.out.print(" направление вверх");
            }
            else if (turn_right < min && turn_right > 0 ){
                min = turn_right;
                y = y + 1;
                System.out.print(" направление вправо");
            }
            else if (turn_down < min && turn_down > 0){
                min = turn_down;
                x = x + 1;
                System.out.print(" направление вниз");
            } 
            else if (turn_left < min && turn_left > 0){
                min = turn_left;
                y = y - 1;
                System.out.print(" направление влево");
            }
            System.out.println(" координаты х у" + x + " " + y + " ходов обратно осталось" + arr[x][y]);
            moves_left = arr[x][y];
        }
        while (moves_left > 1);
    }
}
