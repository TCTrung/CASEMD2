package src;
import java.util.Scanner;

public class MenuADMIN {
    public static void Admin(ManagerAccount List){
        Scanner input = new Scanner(System.in);
        boolean a = true;
        while (a){
            System.out.println("---Giao diện ADMIN---");
            System.out.println("1.Tìm kiếm khách hàng." + "\n" +
                    "2.Xóa khách hàng." + "\n" +
                    "3.Sửa thông tin." + "\n" +
                    "4.Hiển thị danh sách khách hàng." + "\n" +
                    "0.Thoát.");
            System.out.println("Nhập lựa chọn :");
        int choise = input.nextInt();
        input.nextLine();
        switch (choise) {
            case 1:
                    System.out.println("Nhập tài khoản cần tìm kiếm :");
                    String acc = input.nextLine();
                        for (Account ac : List.accounts) {
                            if (ac.getAccount().equals(acc)) {
                                System.out.println(ac);
                                break;
                            }
                        }
                        System.out.println("Không có tài khoản này !");
                         break;

            case 2:
                    System.out.println("Nhập tài khoản muốn xóa :");
                    String account1 = input.nextLine();
                        for (Account ac : List.accounts) {
                            if (ac.getAccount().equals(account1)) {
                                List.removeAccount(ac);
                                System.out.println("Xóa thành công !");
                                break;
                            }
                        }
                        System.out.println("Không có tài khoản này !");
                        break;

            case 3:
                System.out.println("Nhập tài khoản muốn sửa :");
                String account2 = input.nextLine();
                    for (Account ac : List.accounts) {
                        if (ac.getAccount().equals(account2)) {
                            boolean ca = true;
                            while (ca) {
                                System.out.println("1.Sửa tên." + "\n" +
                                        "2.Sửa số điện thoại." + "\n" +
                                        "3.Sửa ngày tháng năm sinh." + "\n" +
                                        "4.Sửa địa chỉ." + "\n" +
                                        "5.Sửa tài khoản." + "\n" +
                                        "6.Sửa mật khẩu." + "\n" +
                                        "0.Thoát.");
                                System.out.println("Nhập lựa chọn :");
                                int c = input.nextInt();
                                input.nextLine();
                                switch (c) {

                                    case 1:
                                        System.out.println("Nhập tên mới :");

                                        String nameNew = input.nextLine();
                                        ac.setFullName(nameNew);
                                        System.out.println("Success !");
                                        break;
                                    case 2:
                                        System.out.println("Nhập số điện thoại mới :");

                                        String phoneNew = input.nextLine();
                                        ac.setPhoneNumber(phoneNew);
                                        System.out.println("Success !");
                                        break;
                                    case 3:
                                        System.out.println("Nhập ngày tháng năm sinh mới :");

                                        String dateNew = input.nextLine();
                                        ac.setBirthDate(dateNew);
                                        System.out.println("Success !");
                                        break;
                                    case 4:
                                        System.out.println("Nhập địa chỉ mới :");
                                        String addressNew = input.nextLine();
                                        ac.setAddress(addressNew);
                                        System.out.println("Success !");
                                        break;
                                    case 5:
                                        System.out.println("Nhập tài khoản mới :");
                                        String accNew = input.nextLine();
                                        ac.setAccount(accNew);
                                        System.out.println("Success !");
                                        break;
                                    case 6:
                                        System.out.println("Nhập mật khẩu mới :");
                                        String passNew = input.nextLine();
                                        ac.setPassword(passNew);
                                        System.out.println("Success !");
                                        break;
                                    case 0:
                                        ca = false;
                                        break;
                                    default:
                                        throw new IllegalStateException("Unexpected value: " + c);
                                }
                            }
                            break;
                        }
                    }
                    System.out.println("Không có tài khoản này !");
                    break;
            case 4:
                List.showAcc();
                break;
            case 0:
                a = false;
            }
        }
    }
}
