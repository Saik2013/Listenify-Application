package listenify;

public class Song {
    private String songTitle;
    private double duration;
    private String passWord;


    public Song(String songTitle, double duration) {
        this.songTitle = songTitle;
        this.duration = duration;
    }

    public String getSongTitle() {

        return songTitle;
    }


    public double getDuration() {

        return duration;
    }
    public String setSongTitle(String newSongTitle, String enteredPassword){
        if(enteredPassword.equals(passWord)){
            songTitle = newSongTitle;
            return "Song title modified successfully";
        }
        return "Incorrect Password";
    }

    public String toString() {
        return "Song{" +
                "songTitle='" + songTitle + '\'' +
                ", duration=" + duration +
                '}';
    }
}
