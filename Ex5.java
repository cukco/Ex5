import java.util.Scanner;
public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<100||n>=1000){
            System.out.print("Số nhập vào không hợp lệ");
        }else{
            String hangdonvi;
            String hangchuc;
            String hangtram;
            int[] array = {0,0,0};
            for(int i=0;i<=2;i++){
                array[i] = n%10;
                n=n/10;
            }
            switch(array[0]) {
                case 1:
                    hangdonvi = "một";
                    break;
                case 2:
                    hangdonvi = "hai";
                    break;
                case 3:
                    hangdonvi = "ba";
                    break;
                case 4:
                    hangdonvi = "bốn"; // Hoặc "tư" tùy vùng miền/ngữ cảnh
                    break;
                case 5:
                    hangdonvi = "năm"; // Sẽ đọc là "lăm" nếu hàng chục > 0
                    break;
                case 6:
                    hangdonvi = "sáu";
                    break;
                case 7:
                    hangdonvi = "bảy";
                    break;
                case 8:
                    hangdonvi = "tám";
                    break;
                case 9:
                    hangdonvi = "chín";
                    break;
                default:
                    hangdonvi = "";
                    break;
            }
            switch (array[1]) {
                case 0:
                    if (array[0] != 0  && array[2] != 0) {
                        hangchuc = "lẻ";
                    } else {
                        hangchuc = "";
                    }
                    break;
                case 1:
                    hangchuc = "mười";
                    break;
                case 2:
                    hangchuc = "hai mươi";
                    break;
                case 3:
                    hangchuc = "ba mươi";
                    break;
                case 4:
                    hangchuc = "bốn mươi";
                    break;
                case 5:
                    hangchuc = "năm mươi";
                    break;
                case 6:
                    hangchuc = "sáu mươi";
                    break;
                case 7:
                    hangchuc = "bảy mươi";
                    break;
                case 8:
                    hangchuc = "tám mươi";
                    break;
                case 9:
                    hangchuc = "chín mươi";
                    break;
                default:
                    hangchuc = "";
                    break;
            }
            switch (array[2]) {
                case 1:
                    hangtram = "một trăm";
                    break;
                case 2:
                    hangtram = "hai trăm";
                    break;
                case 3:
                    hangtram = "ba trăm";
                    break;
                case 4:
                    hangtram = "bốn trăm";
                    break;
                case 5:
                    hangtram = "năm trăm";
                    break;
                case 6:
                    hangtram = "sáu trăm";
                    break;
                case 7:
                    hangtram = "bảy trăm";
                    break;
                case 8:
                    hangtram = "tám trăm";
                    break;
                case 9:
                    hangtram = "chín trăm";
                    break;
                default:
                    hangtram = "";
                    break;
            }
            System.out.print(hangtram+" "+hangchuc+" "+hangdonvi);
        }
    }
}
