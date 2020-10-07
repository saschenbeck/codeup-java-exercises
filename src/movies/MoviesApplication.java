package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - view movies in the musical category\n" +
                "7 - view movies in the comedy category.\n");

        System.out.print("Enter your choice: ");

        Input userInput = new Input();
        int userValue = userInput.getInt();
        Movie[] movieList = MoviesArray.findAll();

        switch (userValue){
            case 0:
                return;
            case 1:
                chosenMovies(movieList);
                break;
            case 2:
                chosenMovies(movieList, "animated");
                break;
            case 3:
                chosenMovies(movieList, "drama");
                break;
            case 4:
                chosenMovies(movieList, "horror");
                break;
            case 5:
                chosenMovies(movieList, "scifi");
                break;
            case 6:
                chosenMovies(movieList, "musical");
                break;
            case 7:
                chosenMovies(movieList, "comedy");
                break;
        }
    }

    public static void chosenMovies(Movie[] movieList){
        for(Movie movie: movieList){
            String movieName = movie.getMovieName();
            String movieCategory = movie.getMovieCategory();
            System.out.println(movieName + " -- " + movieCategory);
        }
    }

    public static void chosenMovies(Movie[] movieList, String category){
        for (Movie movie: movieList){
            String movieCategory = movie.getMovieCategory();
            if (movieCategory.equalsIgnoreCase(category)){
                System.out.println(movie.getMovieName() + " -- " + movie.getMovieCategory());
            }
        }
    }
}

