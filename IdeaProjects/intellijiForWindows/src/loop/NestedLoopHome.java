package loop;

public class NestedLoopHome {

        public static void main(String[] args) {

        /*   1                  1
           121                  121
         12321                  12321// 3 row
       1234321                  1234321

         */
            int odd=1;
            int numOfSpace=14;
            for(int i=1;i<=15;i++) {
                int k = 0;
                for (int j = 1; j <= numOfSpace; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= odd; j++) {
                    if (j <= i) {
                        k = k + 1;
                    } else {
                        k = k - 1;
                    }
                    System.out.print(k);
                }
                System.out.println();
                odd = odd + 2;
                numOfSpace = numOfSpace - 1;

            }

        }// main
    }//EndClass


