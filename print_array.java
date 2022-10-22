public interface print_array {
    public static void pr_ar (int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.format("%4s", arr[i][j]);
            }
            System.out.println(" ");            
        }

 
        }
    } 

