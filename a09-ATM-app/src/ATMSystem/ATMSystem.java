package ATMSystem;

import java.util.Scanner;

public class ATMSystem {

    public static void main(String[] args) {
        AccountList accounts = new AccountList();
        systemStart(accounts);
    }

    public static void systemStart (AccountList accounts) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请选择操作（1：登陆；2：注册；0：退出）：");
            int operateType = scanner.nextInt();

            switch (operateType) {
                case 1:
                    login(scanner, accounts);
                    break;
                case 2:
                    register(scanner, accounts);
                    break;
                case 0:
                    System.out.println("欢迎下次再来。。。");
                    return;
                default:
                    System.out.println("你选择的操作不存在！！！");
            }
        }
    }

//    注册
    private static String userNameKeyIn (Scanner scanner) {
        String userName;
        while (true) {
            System.out.println("请输入你的账户名字（长度： 2-10）：");
            userName = scanner.next();
            int length = userName.length();
            if (length >= 2 && length <= 10) {
                break;
            }
            System.out.println("输入的名字长度不符合约定！！！");
        }
        return userName;
    }

    private static String passwordKeyIn (Scanner scanner) {
        String password;
        while (true) {
            System.out.println("请输入你的账户密码（长度： 2-10）：");
            password = scanner.next();
            int length = password.length();
            if (length >= 2 && length <= 10) {
                System.out.println("请再次输入你的账户密码：");
                String passwordAgain = scanner.next();
                if(password.equals(passwordAgain)) {
                    System.out.println("密码设置成功");
                    break;
                } else {
                    System.out.println("你两次输入的密码不一致！！！密码设置失败。。。");
                    continue;
                }
            }
            System.out.println("输入的密码长度不符合约定！！！");
        }
        return password;
    }

    private static double moneyKeyIn(Scanner scanner) {
        double money;
        while (true) {
            System.out.println("请输入你的账户余额：");
            money = scanner.nextDouble();
            if (money >= 0) {
                break;
            }
            System.out.println("你输入的账户余额不符合约定！！！");
        }
        return money;
    }

    public static void register(Scanner scanner, AccountList accounts) {
        System.out.println("================欢迎进入开户操作================");

        String userName = userNameKeyIn(scanner);
        String password = passwordKeyIn(scanner);
        double money = moneyKeyIn(scanner);

        Account account = new Account(userName, password, money);

        accounts.userAdd(account);
    }

//    登陆
    private static void login(Scanner scanner, AccountList accounts) {
        System.out.println("================欢迎进入登陆操作================");
        while (true) {
            System.out.println("请输入账户：");
            String code = scanner.next();
            Account account = accounts.userQuery(code);
            if (account != null) {
                System.out.println("登陆成功！！！");
                userOperate(scanner, account, accounts);
                break;
            }
            System.out.println("输入账号不存在，请重新输入！");
        }
    }

//    用户操作
    private static void userOperate(Scanner scanner, Account account, AccountList accounts){
        while (true) {
            System.out.println("请选择操作（1：查询；2：存款；3：取款；4：转账；5：修改密码；6：退出；7：注销账户）：");
            int operateType = scanner.nextInt();

            switch (operateType) {
                case 1:
                    System.out.println(account.getUserName()+"先生/女士，你的账户余额是："+account.getMoney()+"元。");
                    break;
                case 2:
                    saveMoney(scanner, account, accounts);
                    break;
                case 3:
                    withdrawMoney(scanner, account, accounts);
                    break;
                case 4:
                    transfer(scanner, account, accounts);
                    break;
                case 5:
                    changePassword(scanner, account, accounts);
                    break;
                case 6:
                    System.out.println("退出操作。");
                    return;
                case 7:
                    accounts.userDelete(account.getUserCode());
                    System.out.println("注销账户成功。。。");
                    return;
                default:
                    System.out.println("操作不存在。。。");
            }
        }
    }

    public static void saveMoney(Scanner scanner, Account account, AccountList accounts){

        while (true) {
            System.out.println("请输入存款金额：");
            double willSaveMoney = scanner.nextDouble();
            if (willSaveMoney > 0) {
                double money = account.getMoney();
                money += willSaveMoney;
                account.setMoney(money);
                boolean success = accounts.modify(account);

                if (success) {
                    System.out.println("存款成功。。。");
                    break;
                }
            }
            System.out.println("存款失败。。。");
        }
    }

    public static void withdrawMoney(Scanner scanner, Account account, AccountList accounts){

        while (true) {
            System.out.println("请输入取款金额：");
            double willWithdrawMoney = scanner.nextDouble();
            if (willWithdrawMoney > 0) {
                double money = account.getMoney();
                if (money >= willWithdrawMoney) {
                    money -= willWithdrawMoney;
                    account.setMoney(money);
                    boolean success = accounts.modify(account);

                    if (success) {
                        System.out.println("取款成功。。。");
                        break;
                    }
                    System.out.println("取款失败。。。");
                    continue;
                }
                System.out.println("余额不足。。。");
                continue;
            }
            System.out.println("取款失败。。。");
        }
    }

    public static void transfer(Scanner scanner, Account account, AccountList accounts){
        while (true) {
            System.out.println("请输入转账账号：");
            String code = scanner.next();
            Account targetAccount = accounts.userQuery(code);
            if (targetAccount != null) {
                while (true) {
                    System.out.println("请输入转账金额：");
                    double willWithdrawMoney = scanner.nextDouble();
                    if (willWithdrawMoney > 0) {
                        double money = account.getMoney();
                        if (money >= willWithdrawMoney) {
                            money -= willWithdrawMoney;
                            account.setMoney(money);

                            double targetMoney = targetAccount.getMoney();
                            targetMoney +=willWithdrawMoney;
                            targetAccount.setMoney(targetMoney);

                            boolean success = accounts.modify(account);
                            boolean targetSuccess = accounts.modify(targetAccount);

                            if (success && targetSuccess) {
                                System.out.println("转账成功。。。");
                                return;
                            }
                            System.out.println("转账失败。。。");
                        }
                        System.out.println("余额不足。。。");
                        continue;
                    }
                    System.out.println("取款失败。。。");
                }
            }
            System.out.println("转账账号不存在。。。");

        }
    }

    public static void changePassword(Scanner scanner, Account account, AccountList accounts){
        while (true) {
            System.out.println("请输入旧的密码：");
            String oldPsw = scanner.next();
            String password = account.getPassword();
            if (oldPsw.equals(password)) {
                while (true) {
                    System.out.println("请输入新的密码：");
                    String newPsw = scanner.next();
                    System.out.println("请输入新的密码：");
                    String newPswAgain = scanner.next();

                    if (newPswAgain.equals(newPsw)) {
                        account.setPassword(newPsw);
                        boolean success = accounts.modify(account);
                        if (success) {
                            System.out.println("密码修改成功。。。");

                            return;
                        }
                        System.out.println("修改失败");
                        continue;
                    }
                    System.out.println("两次输入不一致哦。。。");
                }
            }

            System.out.println("密码不正确，请重新输入。。。");
        }
    }
}
