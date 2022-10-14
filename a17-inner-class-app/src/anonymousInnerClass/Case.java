package anonymousInnerClass;

public class Case {
    public static void main(String[] args) {
        Swimming s = new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生游泳很快。。。");
            }
        };

        go(s);
    }

    public static void go(Swimming s) {
        s.swim();
    }
}

interface Swimming {
    void swim();
}

