package bai6;

import java.util.Scanner;
public class bai6 {
    private String bookID;
    private String bookName;
    private float inportPrice;
    private float exportPrice;
    private String author;
    private float inerest; // lợi nhuận
    private int year;

    public bai6() {
    }

    public bai6(String bookID, String bookName, float inportPrice, float exportPrice, String author, float inerest, int year) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.inportPrice = inportPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.inerest = inerest;
        this.year = year;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getInportPrice() {
        return inportPrice;
    }

    public void setInportPrice(float inportPrice) {
        this.inportPrice = inportPrice;
    }

    public float getExportPrice() {
        return exportPrice = exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getInerest() {
        return inerest = inerest;
    }

    public void setInerest(float inerest) {
        this.inerest = inerest;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void inputInfor(Scanner scanner,bai6[] book, int index) {
        boolean checkId = true;
        do {
            System.out.println("Nhập mã  sách: ");
            this.bookID = scanner.nextLine();
            boolean check = false;
            for (int i = 0; i < index; i++) {
                if (bookID.equals(book[i].getBookID())) {
                    check = true;
                    System.out.println("Mã sách đã bị trùng, Nhập  lại");
                }
            }
            if (!check) {
                checkId = false;
            }

        } while (checkId);
        boolean cheackName = true;
        do {
            System.out.println("Nhập tên sách: ");
            this.bookName = scanner.nextLine();
            boolean check = false;
            for (int i = 0; i < index; i++) {
                if (bookName.equals(book[i].getBookName())) {
                    check = false;
                    System.out.println("Đã có tên sách này! Nhập lại");
                }
                if (book[i].getBookName().length() < 4) {
                    check = false;
                    System.out.println("Tên sách phải trên 4 kí tự! Nhập lại");
                }
            }
            if (!check) {
                cheackName = false;
            }
        } while (cheackName);
        System.out.println("Giá nhập của sách: ");
        this.inportPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập tác giả: ");
        this.author = scanner.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        this.year = Integer.parseInt(scanner.nextLine());
    }

    public float tinhLoiNhuan() {
        this.inerest = (int) this.exportPrice - this.inportPrice;
        return inerest;
    }

    public float giaXuatRa() {
        this.exportPrice = (float) (this.inportPrice + (this.inportPrice * 0.3));
        return (this.exportPrice);
    }

    public void outputInfor() {
        System.out.println("Mã sách: " + this.bookID);
        System.out.println("Tên saách: " + this.bookName);
        System.out.println("Giá nhập : " + this.inportPrice);
        System.out.println("Giá xuât ra: " + giaXuatRa());
        System.out.println("Nhà xuất bản: " + this.author);
        System.out.println("Lợi nhuận: " + tinhLoiNhuan());
    }

    public void sapXepTangDan(bai6[] book, int index) {// sắp xếp tăng dần theo giá sách nhập vào
        for (int i = 0; i < index-1; i++) {
            for (int j = i+1; j < index; j++) {

                if (book[i].getInportPrice() > book[j].getInportPrice()) {
                    float tem1 = book[i].getInportPrice();
                    book[i].setInportPrice(book[j].getInportPrice());
                    book[j].setInportPrice(tem1);

                }
            }
        }
    }
    public void sapXepGiamDan(bai6 [] book , int index){ // sắp xêp sách theo lợi nhuận giảm dần
        for (int i = 0; i < index-1; i++) {
            for (int j = i + 1; j < index; j++) {

                if (book[i].getInerest() < book[j].getInerest())
                {
                    float tem1 = book[i].getInerest();
                    book[i].setInerest(book[j].getInerest());
                    book[j].setInportPrice(tem1);
                }
            }
        }
    }
    public  void findBook(Scanner scanner,bai6 [] book , int index)
    {
        System.out.println("Nhập tên sách cần tìm: ");
        String nameBook=scanner.nextLine();
        for(int i=0;i<index;i++)
        {
            if(nameBook.equals(book[i].getBookName()))
            {
                System.out.println(" Đã có sách naày");
            }
            else
            {
                System.out.println(" Chưa có sách này");
            }
        }
    }
    public  void thongKeTheoNam(bai6 [] book , int index)
    {
        int cout=0;
        for(int i=0;i<index-1;i++)
        {
            for(int j=0;j<index;j++)
            {
                if(book[i].getYear()!=0)
                {
                    cout+=1;
                }
            }
        }
        System.out.println(" "+getYear()+ "  "+cout);
    }

}