package ATMSystem;

import java.util.ArrayList;

public class AccountList {
    private ArrayList<Account> accounts= new ArrayList<>();

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public Account userQuery(String code){
        Account account = null;
        for (int i = 0; i < accounts.size(); i++) {
            String currentCode = accounts.get(i).getUserCode();
            if (currentCode.equals(code)) {
                account = accounts.get(i);
                break;
            }
        }
        return account;
    }

    public boolean userAdd(Account account){
        System.out.println("恭喜你，"+account.getUserName()+"先生/女士，你的卡号是："+account.getUserCode() + "，你的账户余额是："+account.getMoney()+"元。");
        return accounts.add(account);
    }

    public Account userDelete(String code) {
        Account account = null;
        for (int i = 0; i < accounts.size(); i++) {
            String currentCode = accounts.get(i).getUserCode();
            if (currentCode.equals(code)) {
                account = accounts.remove(i);
                System.out.println(account.getUserName() + "在本行的账户（"+code+"）已经被注销，余额："+account.getMoney() +"元，视为自动放弃！！！");
            }
        }
        if(account == null) {
            System.out.println("你输入的账号不存在！！！");
        }

        return account;
    }

    public boolean modify(Account account){
        String code = account.getUserCode();
        for (int i = 0; i < accounts.size(); i++) {
            String currentCode = accounts.get(i).getUserCode();
            if (currentCode.equals(code)) {
                accounts.set(i, account);
                return true;
            }
        }
        return false;
    }
}
