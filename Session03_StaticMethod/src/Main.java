public class Main {
    public static void main(String[] args) {
        //Xay dung 1 phuong thuc cho phep tinh tong 2 so nguyen
        int a = 5;
        int b = 7;
        int[] arrInt = {3,8,5};
        System.out.printf("Gia tri cac bien truoc khi goi phuong thuc: a = %d, b = %d\n ",a,b);
        int tong = Main.add(a,b);
        System.out.printf("Gia tri cac bien sau khi goi phuong thuc: a = %d, b = %d\n ",a,b);
        System.out.println("Tong 2 so la: "+tong);
        Main.hello();
        Main.printArray(arrInt);
        System.out.println("Mang sau khi thay doi: ");
        System.out.println("Gia tri cac phan tu trong mang la: ");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("%d\t",arrInt[i]);
        }
        System.out.printf("\n");
    }
    public static int add(int a, int b){
        a++;
        b++;
        int sum = a+b;
        return sum;
    }
    public static void hello(){
        System.out.println("Xin chao cac ban lop Java-08");
        System.out.println("Tong 2 so la: "+add(3,6));
    }
    public static void printArray(int[] arrInt){
        System.out.println("Mang truoc khi thay doi: ");
        System.out.println("Gia tri cac phan tu trong mang la: ");
        for (int i = 0; i < arrInt.length; i++) {
            System.out.printf("%d\t",arrInt[i]);
        }
        System.out.printf("\n");
        arrInt[0] = 9;
    }
}