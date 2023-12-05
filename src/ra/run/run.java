package ra.run;

import com.sun.tools.javac.Main;
import bai6.bai6;

import java.util.Scanner;

public class BoolImp {
    int index = 0;
    bai6[] book = new bai6[100];

    public static void main(String[] args) {
        BoolImp book2 = new BoolImp();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("**************Menu***************");
            System.out.println("1. Nhập thông tin sách");
            System.out.println("2. Tính lợi nhuận sách");
            System.out.println("3. Hiển thị thông tin sách");
            System.out.println("4. Sắp xếp sách theo giá tăng dần");
            System.out.println("5. Sắp xếp sách theo lợi nhuận giảm dần");
            System.out.println("6. Tìm sách theo tên sách: ");
            System.out.println("7. Thống kê sách theo năm xuất bản: ");
            System.out.println("8. Thống kê số lượng sách theo tác giả: ");
            System.out.println("9. Thoát");
            System.out.printf("Xin mời lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    book2.Input(scanner);
                    break;
                case 2:
                    book2.tinhsGiaTriLoiNhuan();
                    System.out.println("Đã hoàn thành");
                    break;
                case 3:
                    book2.outPut();
                    break;
                case 4:
                    book2.sapXepTang();
                    break;
                case 5:
                    book2.sapXepGianDan();
                    break;
                case 6:
                    book2.find();
                    break;
                case 7:
                    book2.cout();
                    break;
                case 8:
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Xin hãy chọn từ 1-9");
            }
        } while (true);
    }

    public void Input(Scanner scanner) {
        System.out.println("Nhập số lượng mảng:  ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            if (index < book.length) {
                book[index] = new bai6 ();
                book[index].inputInfor(scanner, book, index);
                index++;
            }
        }

    }

    public void outPut() {
        for (int i = 0; i < index; i++) {
            book[i].outputInfor();
        }
    }

    public void tinhsGiaTriLoiNhuan() {
        for (int i = 0; i < index; i++) {
            book[i].giaXuatRa();
            book[i].tinhLoiNhuan();
        }
    }

    public void sapXepTang() {
        for(int i=0;i<index;i++) {
            book[i].sapXepTangDan(book, index);
        }
        System.out.println("Sắp xếp tăng dần theo giá nhập vào đã hoàn thành ");
    }
    public  void sapXepGianDan(){ // sắp xếp giảm dần theo lợi nhuận
        for(int i=0;i<index;i++)
        {
            book[i].sapXepGiamDan(book,index);
        }
        System.out.println("Sắp xếp giảm dân theo lợi nhậu đã hoàn thành");
    }
    public  void find()
    {
        for(int i=0;i<index;i++)
        {
            book[i].findBook(new  Scanner(System.in),book,index);
        }
    }
    public  void cout()
    {
        for(int i=0;i<index;i++)
        {
            book[i].thongKeTheoNam(book,index);
        }
    }
}