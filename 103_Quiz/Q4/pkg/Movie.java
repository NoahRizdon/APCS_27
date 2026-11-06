package pkg;
public class Movie {
    
    private String movieName;
    private double movieRating;
    private int ratingAmt;
    private int movieRevenue;

    public Movie(){
        movieName = "Avengers";
        movieRating = 8.0;
        ratingAmt = 33;
        movieRevenue = 623357910;
    }
    public Movie(String movnam, double rat, int ratAmt, int rev){
        movieName = movnam;
        movieRating = rat;
        ratingAmt = ratAmt;
        movieRevenue = rev;
    }

    public void movieToString(){
        System.out.print("Movie: " + movieName  + "\n" + "Rating: " + movieRating + "\n" + "Number of Ratings: " + ratingAmt + "\n" + "Revenue: " + movieRevenue + "\n");
    }
    public String getMovieName(){
        return movieName;
    }
     public double getMovieRating(){
        return movieRating;
     } 

     public int getRevenue(){
        return movieRevenue;
     }
     public void addRating(double newRat){
    double totalRating = movieRating*ratingAmt;
    totalRating += newRat;
    ratingAmt++;
    movieRating = totalRating/ratingAmt;
     }
     
     public boolean compareRatings(Movie two){
        if(two.getMovieRating() < movieRating){
            return true;
        }
        else{
            return false;
        }
        // public int revenueToString(){
        // while(true;){
        //     movieRevenue = movieRevenue/1000;
        //     movieRevenue = 
        // }
        
        }
     }

}