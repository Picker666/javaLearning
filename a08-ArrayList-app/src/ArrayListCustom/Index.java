package ArrayListCustom;

import java.util.ArrayList;

public class Index {
    public static void main(String[] args) {

        Movie m1 = new Movie("《肖申克的救赎》", 9.8, "罗宾斯");
        Movie m2 = new Movie("《这个杀手不太冷静》", 9.0, "魏翔");
        Movie m3 = new Movie("《红海行动》", 9.7, "吴京");

        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(m1);
        movies.add(m2);
        movies.add(m3);

        System.out.println(movies);

        int size = movies.size();
        for (int i = 0; i < size; i++) {
            Movie movie = movies.get(i);

            String name = movie.getName();
            double score = movie.getScore();
            String actor = movie.getActor();

            System.out.println(actor + "主演的" + name+ "，获得" + score + "评分。。。");
        }
    }
}
