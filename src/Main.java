public class Main {
    public static void main(String[] args) {

// half pyramid
//        for (int i = 0; i <= 5; i++) {
//            for(int j =0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//inverted half pyramid
//        for (int i = 5; i>0;i--){
//            for(int j=i;j>0;j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //inverted half pyramid rotated by 180 deg
        int a = 5;
        for (int i = 0; i <= a; i++) {
            for(int j =0;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println("*");

        }


        // hollow rectangle
//        int n =4;
//        int m =4;
//        for (int i = 1; i <= n ; i++) {
//            for(int j=1; j<=m;j++){
//                if(i==1 || i==n || j==m || j==1){
//                    System.out.print("*");
//
//                }else{
//                    System.out.print(" ");
//                }
//            }
//
//                System.out.println();
//
//
//
//        }

    }
}