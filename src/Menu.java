package src;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ManagerAccount AccList = new ManagerAccount();
        Account admin = new Account("admin","admin");
        AccList.AddAccount(admin);
        boolean check = true;
        while (check) {
            System.out.println("------MENU------");
            System.out.println("1.Đăng ký." + "\n" + "2.Đăng nhập." + "\n" + "0. Thoát. ");
            System.out.println("Nhập lựa chọn :");
            int choise = scanner.nextInt();
            switch (choise){
                case 1:
                    CreateAcc a = new CreateAcc();
                    a.Create(AccList);
                    break;
                case 2:
                    Login b = new Login();
                    b.loginACC(AccList);
                    break;
                case 0:
                    check = false;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choise);
            }
        }
    }
}
