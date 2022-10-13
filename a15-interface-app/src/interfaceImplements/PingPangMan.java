package interfaceImplements;

public class PingPangMan implements SportMan,Law {
    private String name;

    @Override
    public void run() {
        System.out.println(name + "跑步。。。");
    }

    @Override
    public void competition() {
        System.out.println(name + "参加比赛。。。");
    }

    @Override
    public void rule() {
        System.out.println(name + "遵纪守法。。。");
    }

    public PingPangMan(String name) {
        this.name = name;
    }

    public PingPangMan() {
    }
}
