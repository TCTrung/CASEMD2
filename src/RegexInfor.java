package src;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexInfor {
    public static String nhapTen(Scanner scanner) {
        String hoTen;
        boolean hopLe = false;
        String regex = "^[A-Z][a-z]*( [A-Z][a-z]*)*$";
        do {
            System.out.println("Nhập họ & tên: ");
            hoTen = scanner.nextLine();
            Matcher matcher = Pattern.compile(regex).matcher(hoTen);
            if (matcher.matches()) {
                hopLe = true;
            } else {
                System.out.println("Họ và tên không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!hopLe);
        return hoTen;
    }

    public static String nhapDate(Scanner scanner){
        String ngaySinh;
        boolean hopLe = false;
        String regex = "^(0[1-9]|[12][0-9]|3[01])[/-](0[1-9]|1[0-2])[/-]\\d{4}$";
        do {
            System.out.println("Nhập ngày tháng năm sinh (dd/mm/yy hoặc dd-mm-yy): ");
            ngaySinh = scanner.nextLine();
            Matcher matcher = Pattern.compile(regex).matcher(ngaySinh);
            if (matcher.matches()) {
                hopLe = true;
            } else {
                System.out.println("Ngày tháng năm sinh không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!hopLe);
        return ngaySinh;
    }

    public static String nhapPhone(Scanner scanner){
        String soDienThoai;
        boolean hopLe = false;
        String regex = "^(0|84)\\d{9}$";
        do {
            System.out.println("Nhập số điện thoại (bắt đầu bằng 0 hoặc 84 và có 9 số đằng sau): ");
            soDienThoai = scanner.nextLine();
            Matcher matcher = Pattern.compile(regex).matcher(soDienThoai);
            if (matcher.matches()) {
                hopLe = true;
            } else {
                System.out.println("Số điện thoại không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!hopLe);
        return soDienThoai;
    }

    public static String nhapSTK(Scanner scanner) {
        String taiKhoan;
        boolean hopLe = false;
        String regex = "^[a-zA-Z0-9]{8,16}$";
        do {
            System.out.println("Nhập tài khoản (8-16 kí tự là số hoặc chữ): ");
            taiKhoan = scanner.nextLine();
            Matcher matcher = Pattern.compile(regex).matcher(taiKhoan);
            if (matcher.matches()) {
                hopLe = true;
            } else {
                System.out.println("Tài khoản không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!hopLe);
        return taiKhoan;
    }

    static String nhapPass(Scanner scanner) {
        String matKhau;
        boolean hopLe = false;
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[!@])([a-z0-9!@]{6,12})$";

        do {
            System.out.println("Nhập mật khẩu (6-12 kí tự, bao gồm số và chữ không viết hoa, và có một kí tự đặc biệt ! hoặc @): ");
            matKhau = scanner.nextLine();

            Matcher matcher = Pattern.compile(regex).matcher(matKhau);
            if (matcher.matches()) {
                hopLe = true;
            } else {
                System.out.println("Mật khẩu không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!hopLe);

        return matKhau;
    }
}
