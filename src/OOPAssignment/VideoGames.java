package OOPAssignment;

public class VideoGames extends Games {

    /**
     * VideoGames class file
     * @author A. Young
     * 
     */
    
    private String console;
    private String gameGenre;
    private Boolean online;

    public VideoGames (Double price, String nameOfProduct, int playerCount, int ageRate, String console, String gameGenre, Boolean online ){
        super(price, nameOfProduct, playerCount, ageRate);
        this.console = console;
        this.gameGenre = gameGenre;
        this.online = online;
    }

    public String getConsole() {
        return this.console;
    }

    public String getGenre() {
        return this.gameGenre;
    }

    public Boolean getOnline(){
        return this.online;
    }
}
