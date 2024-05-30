package listenify;
import java.util.ArrayList;
import java.util.List;
public class album {
    private String albumName;
    private String artistName;
    private List<Song> songList;

    //constructor
    public album(String albumName,String artistName){
        this.albumName = albumName;
        this.artistName = artistName;
        //list initialisation
        songList = new ArrayList<>();
    }

    //to find song in list
    public boolean findSong(String title){
        for(int i=0; i<songList.size();i++){
            Song song = songList.get(i);
            if(song.getSongTitle().equals(title)){
                return true;
            }
        }
        return false;
    }
    //add song to list
    public String addNewSongToPlayList(String title,double duration){
        if(findSong(title)==false){
            Song song = new Song(title,duration);
            songList.add(song);
            return "song has been added to the playlist";
        }
        return "song is already present";
    }
    public void addSongToPlayList(int songNo,List<Song>playList){
        //list is 0-based indexing
        //song is start from 1
        int index = songNo -1;

        if(index <= songList.size()-1){
            Song song = songList.get(index);
            playList.add(song);
        }
    }
    //
    public void addSongToPlayList(String title,List<Song>playList){
        for(Song song : songList){
            if(song.getSongTitle().equals(title)){
                playList.add(song);
                return;
            }
        }
    }
}
