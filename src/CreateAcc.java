package src;

import java.io.IOException;
import java.util.Scanner;

public class CreateAcc {
    public void Create(ManagerAccount List) throws IOException {
        try {
            Scanner scanner = new Scanner(System.in);
            String FullName = RegexInfor.nhapTen(scanner);
            String birthDate = RegexInfor.nhapDate(scanner);
            String PhoneNumber = RegexInfor.nhapPhone(scanner);
            System.out.println("Nhập địa chỉ: ");
            String Address = scanner.nextLine();
            String Account = RegexInfor.nhapSTK(scanner);
            String Password = RegexInfor.nhapPass(scanner);
            Account account = new Account(FullName, birthDate, PhoneNumber,
                    Address, Account, Password);

                if (FullName.isEmpty() || birthDate.isEmpty() || PhoneNumber.isEmpty() ||
                        Address.isEmpty() || Account.isEmpty() || Password.isEmpty()) {

                    System.out.println("Vui lòng nhập lại !");
                } else {
                    List.AddAccount(account);
                    System.out.println("---Đăng ký thành công---");

                }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
