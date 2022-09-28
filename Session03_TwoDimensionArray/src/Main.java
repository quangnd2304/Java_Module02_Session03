import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Khai bao mang 2 chieu so nguyen gom 3 dong va 4 cot --> 12 phan tu
        int[][] arrInt = new int[3][4];
        //Nhap gia tri cho cac phan tu mang 2 chieu tu ban phim
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("arrInt[%d][%d]=",i,j);
                arrInt[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        //In gia tri cac phan tu trong mang arrInt theo ma tran
        System.out.println("Gia tri cac phan tu mang 2 chieu la: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d\t",arrInt[i][j]);
            }
            System.out.printf("\n");
        }
    }
}