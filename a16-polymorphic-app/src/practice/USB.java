package practice;

public abstract class USB implements UsbInterface {
    private String name;

    public USB(String name) {
        this.name = name;
    }

    public USB() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public abstract void operation();

    public void useDevice(){
        this.input();
        this.operation();
        this.output();
    }
}
