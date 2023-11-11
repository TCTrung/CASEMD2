package src;

import java.io.Serializable;
import java.util.ArrayList;

public class ManagerAccount implements Serializable {
    ArrayList<Account> accounts;
    public ManagerAccount(){
        this.accounts = new ArrayList<Account>();
    }
    public void removeAccount(Account acc){
        accounts.remove(acc);
    }
    public void AddAccount(Account acc){
        accounts.add(acc);
    }
    public void showAcc(){
        int i = 1;
        for(Account txt : accounts){
            System.out.println("----Khách hàng " + i + " la: ----" + "\n" + txt);
            i++;
        }
    }
}
