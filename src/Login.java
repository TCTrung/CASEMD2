package src;
import java.util.Scanner;

public class Login {
    public void loginACC(ManagerAccount List){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tài khoản : ");
        String account = scanner.nextLine();
        System.out.println("Nhập mật khẩu : ");
        String Password = scanner.nextLine();
        for (Account ac : List.accounts) {
            if (ac.getAccount().equals(account) && ac.getPassword().equals(Password)
                    && !ac.getAccount().equals("admin") && !ac.getPassword().equals("admin")) {
                System.out.println("Đăng nhập thành công");
                boolean a = true;
                while (a){
                    System.out.println("1.Nạp tiền." + "\n" +
                            "2.Rút tiền." + "\n" +
                            "3.Chuyển tiền." + "\n" +
                            "4.Xem số dư." + "\n" +
                            "0.Thoát.");
                    System.out.println("Nhập lựa chọn :");
                    int choisee = scanner.nextInt();
                    switch (choisee){
                        case 1:
                            System.out.println("Nhập số tiền cần nạp :");
                            double money = scanner.nextDouble();
                            ac.napTien(money);
                            System.out.println("Nạp tiền thành công.");
                            break;
                        case 2:
                            System.out.println("Nhập số tiền muốn rút :");
                            double moneyWithdraw = scanner.nextDouble();
                            ac.rutTien(moneyWithdraw);
                            System.out.println("Rút tiền thành công.");
                            break;
                        case 3:
                            System.out.println("Nhập số tiền cần chuyển :");
                            double tienGui = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.println("Nhập tài khoản cần chuyển :");
                            String accNew = scanner.nextLine();
                            for (Account acc: List.accounts) {
                                if (acc.getAccount().equals(accNew)){
                                    acc.napTien(tienGui);
                                    ac.rutTien(tienGui);
                                    System.out.println("Chuyển tiền thành công !");
                                    break;
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Số dư : "+ ac.getBalance());
                            break;
                        case 0:
                            a = false;
                            break;
                    }
                }
                break;
            }else if (ac.getAccount().equals(account) && ac.getPassword().equals(Password)
                    && ac.getAccount().equals("admin") && ac.getPassword().equals("admin")) {
                   MenuADMIN.Admin(List);
                   break;
            }
        }
        System.out.println("Sai tài khoản hoặc mật khẩu,mời nhập lại !");
    }
}
