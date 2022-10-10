package ATMSystem;

import java.util.Random;

public class Account {
    private String userName;
    private String password;
    private double money;
    private String userCode;

    public Account(String userName, String password, double money) {
        this.userName = userName;
        this.password = password;
        this.money = money;
        this.userCode = generateCode();
    }

    public Account() {
    }

    public static String generateCode () {
        Random random = new Random();
        String code = "";
        for (int i = 0; i < 6; i++) {
            code += random.nextInt(10);
        }

        return code;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getUserCode() {
        return userCode;
    }
}
