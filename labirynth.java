import java.util.Scanner;
public class labirynth{
    public static void main (String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.print("Input x " );        
        x = in.nextInt();
        System.out.print("Input y " );
        y = in.nextInt();
        in.close();
        System.out.println(x + " " + y);
        int [][] arr = create_array.cr_ar(x, y);
        moving.mov_through(arr);
        System.out.println();
        print_array.pr_ar(arr);
        way_back.find_the_way(arr);
    }
}
