
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    @Override
    public boolean equals(Object song) {
        
        if (this == song) { 
            return true;
        }
        
        if (song instanceof Song) {
            if (this.artist.equals(((Song)(song)).getArtist()) && this.durationInSeconds == ((Song)(song)).getDurationInSeconds() && this.name.equals(((Song)(song)).getName())) {
                return true;
            } else {
                return false;
            }
        } else { 
            return false;
        }

        
        
        
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

}
