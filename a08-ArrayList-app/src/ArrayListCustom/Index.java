package ArrayListCustom;

import java.util.ArrayList;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {

        ArrayList<Movie> movies = moviesCreate();
        moviesShow(movies);


        studentSysTem();
    }

    public static ArrayList<Movie> moviesCreate () {
        Movie m1 = new Movie("《肖申克的救赎》", 9.8, "罗宾斯");
        Movie m2 = new Movie("《这个杀手不太冷静》", 9.0, "魏翔");
        Movie m3 = new Movie("《红海行动》", 9.7, "吴京");

        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(m1);
        movies.add(m2);
        movies.add(m3);

        return movies;
    }

    public static void moviesShow (ArrayList<Movie> movies) {
        int size = movies.size();
        for (int i = 0; i < size; i++) {
            Movie movie = movies.get(i);

            String name = movie.getName();
            double score = movie.getScore();
            String actor = movie.getActor();

            System.out.println(actor + "主演的" + name+ "，获得" + score + "评分。。。");
        }
    }

    public static ArrayList<Student> studentsCreate() {
        Student s1 = new Student("2022010101", "叶孤城", 18, "一年级一班");
        Student s2 = new Student("2022010102", "东方不败", 28, "一年级二班");
        Student s3 = new Student("2022010103", "西门吹雪", 38, "一年级三班");
        Student s4 = new Student("2022010104", "梅长苏", 48, "一年级4班");

        ArrayList<Student> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        return students;
    }

    public static void studentSysTem() {
        ArrayList<Student> students = studentsCreate();
        studentsQuery(students);
        keyInQuery(students);
    }

    public static void studentShow (Student student) {
        String name = student.getName();
        String id = student.getId();
        int age = student.getAge();
        String gradeClass = student.getGradeClass();

        System.out.println("学号是：" + id + "的" + name + "，" + age + "岁，在" + gradeClass + "。。。");
    }

    public static void studentsQuery(ArrayList<Student> students) {
        int size = students.size();
        for (int i = 0; i < size; i++) {
            Student student = students.get(i);
            studentShow(student);
        }
    }

    public static void keyInQuery(ArrayList<Student> students) {
        System.out.println("请输入学号");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        studentsQuery(students, id);
    }

    public static void studentsQuery(ArrayList<Student> students, String id) {
        int size = students.size();
        for (int i = 0; i < size; i++) {
            Student student = students.get(i);
            String currentId = student.getId();
            if (currentId.equals(id)) {
                studentShow(student);
                return;
            }

        }
        System.out.println("查无此人！！！");
    }
}
