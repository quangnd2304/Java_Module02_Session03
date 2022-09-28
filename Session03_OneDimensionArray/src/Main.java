import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Khai báo mảng 1 chiều số nguyên gồm 5 phần tử
        int[] arrInt = new int[5];
        //Khai báo mảng 1 chiều chuỗi gồm 3 phần tu
        String[] arrString = new String[3];
        //Khoi tao gia tri cac phan tu cho mang arrInt
        arrInt[0] = 4;
        arrInt[1] = 3;
        arrInt[2] = 6;
        arrInt[3] = 10;
        arrInt[4] = 6;
//        //Exception
//        arrInt[5] = 4;
        //Khoi tao mang co ten la c kieu chuoi gom 3 phan tu: Nguyen Van A, Nguyen Van B, Nguyen Van C
        String[] arrStudent = {"Nguyen Van A","Nguyen Van B","Nguyen Van C"};
        //In ra cac gia tri phan tu cua mang arrInt
        System.out.println("Gia tri cac phan tu mang arrInt la: ");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("%d\t",arrInt[i]);
        }
        System.out.printf("\n");
        //Nhap gia tri cac phan tu cua mang arrString tu ban phim
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrString.length; i++) {
            System.out.printf("Nhap gia tri phan tu thu %d: ",(i+1));
            arrString[i] = sc.nextLine();
        }
        //In gia tri cac phan tu cua mang arrString
        System.out.println("Gia tri cac phan tu mang arrString la: ");
        for (int i = 0; i < arrString.length; i++) {
            System.out.printf("%s\t",arrString[i]);
        }
        System.out.printf("\n");
        //Sap xep mang arrInt tang dan
        for (int i = 0; i < arrInt.length-1; i++) {
            for (int j = i+1; j <arrInt.length ; j++) {
                if (arrInt[i]>arrInt[j]){
                    //Doi cho phan tu i va j
                    int temp = arrInt[i];
                    arrInt[i] = arrInt[j];
                    arrInt[j] = temp;
                }
            }
        }
        //In ra mang sau khi sap xep
        System.out.println("Mang sau khi sap xep la: ");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("%d\t",arrInt[i]);
        }
        System.out.printf("\n");
    }
}