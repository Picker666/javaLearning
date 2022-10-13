package interfaceInherit;

public class BasketballMan implements SportMan {
    private String name;
    @Override
    public void rule() {
        System.out.println();
    }

    @Override
    public void complete() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void run() {

    }

    public BasketballMan(String name) {
        this.name = name;
    }

    public BasketballMan() {
    }
}
