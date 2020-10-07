package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String movieName, String movieCategory) {
        this.name = movieName;
        this.category = movieCategory;
    };

    public String getMovieName(){
        return this.name;
    }

    public void setMovieName(String newName){
        this.name = newName;
    }

    public String getMovieCategory(){
        return this.category;
    }

    public void setMovieCategory(String newCategory){
        this.category = newCategory;
    }
}
