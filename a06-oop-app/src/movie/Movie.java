package movie;

public class Movie {
    private String name;
    private String date;
    private double score;
    private String type;
    private double price;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Movie(String name, String date, double score, String type, double price, String description) {
        this.name = name;
        this.date = date;
        this.score = score;
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public Movie() {
    }
}
