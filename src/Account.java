package src;

import java.io.Serializable;

public class Account implements Serializable {
    private String FullName;
    private String birthDate;
    private String PhoneNumber;
    private String Address;
    private String Account;
    private String Password;
    private double balance;

    public double getBalance() {
        return balance;
    }
    public void rutTien(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;

        } else {
            System.out.println("Số tiền rút không hợp lệ hoặc không đủ số dư.");
        }
    }

    public void napTien(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Số tiền nạp phải lớn hơn 0.");
        }

    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getFullName(String string) {
        return FullName;
    }
    public void setFullName(String fullName) {
        FullName = fullName;
    }
    public String getBirthDate(String string) {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public String getPhoneNumber(String string) {
        return PhoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    public String getAddress(String string) {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getAccount() {
        return Account;
    }
    public void setAccount(String account) {
        Account = account;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public Account(){}
    public Account(String account, String password) {
        this.Account = account;
        this.Password = password;
    }
    public Account(String fullName, String birthDate, String phoneNumber,
                   String address, String account, String password) {
        this.FullName = fullName;
        this.birthDate = birthDate;
        this.PhoneNumber = phoneNumber;
        this.Address = address;
        this.Account = account;
        this.Password = password;
        this.balance = 1000.0;
    }
    @Override
    public String toString() {
        return "Tên khách hàng: " + this.FullName +"\n" +
                "Năm sinh: " + this.birthDate + "\n" +
                "Số điện thoại: " + this.PhoneNumber + "\n" +
                "Địa chỉ: " + this.Address + "\n" +
                "Số dư: " + this.balance + " VND" + "\n" +
                "Tên tài khoản: " + this.Account + "\n" +
                "Mật khẩu: " + this.Password;
    }
}

