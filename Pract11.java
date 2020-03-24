import java.util.*;

public class Pract11{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int x=0; x < 6; x++){
                array[i][x] = in.nextInt();
            }
        }

        int sum[] = new int[16];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int x = 0; x < 4; x++) {
                sum[k] = array[i][x] + array[i][x+1] + array[i][x+2] + array[i+1][x+1] + array[i+2][x] + array[i+2][x+1] + array[i+2][x+2];
                k++;
            }
        }
        Arrays.sort(sum);
        System.out.println(sum[15]);
    }
}
//hr day 11