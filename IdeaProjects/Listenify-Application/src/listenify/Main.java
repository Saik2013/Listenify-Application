package listenify;
import java.util.*;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        album sidAlbum = new album("loveAndSad","sidSri");

        sidAlbum.addNewSongToPlayList("vennela teluse",3.50);
        sidAlbum.addNewSongToPlayList("samajavaragamana",4.00);
        sidAlbum.addNewSongToPlayList("aaradya",4.50);

        album arigitAlbum = new album("hindi hits","arigit singh");

        arigitAlbum.addNewSongToPlayList("anuvu anuvu",4.2);
        arigitAlbum.addNewSongToPlayList("tum hi vo",5.5);
        arigitAlbum.addNewSongToPlayList("kesariya",4.0);


        List<Song> playList = new ArrayList<>();
        sidAlbum.addSongToPlayList(1,playList);
        sidAlbum.addSongToPlayList("kalavathi",playList);
        arigitAlbum.addSongToPlayList(2,playList);
        arigitAlbum.addSongToPlayList("kesariya",playList);

        System.out.println("Welcome to the listenify application");
        int currSongInd = 0;
        System.out.println("Now playing "+playList.get(currSongInd).toString());
        printMenu();
        startPlayList(playList);

    }
    public static void startPlayList(List<Song>playList){
        Scanner sc = new Scanner(System.in);
        boolean quitApp = false;

        int currSongInd =0;
        while(quitApp == false){
            System.out.println("enter your choice!");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    currSongInd = currSongInd+1;
                    if(currSongInd == playList.size()){
                        currSongInd =0;
                    }
                    System.out.println("Now playing "+playList.get(currSongInd).toString());
                    break;
                case 2:
                    currSongInd = currSongInd-1;
                    if(currSongInd == -1){
                        currSongInd =0;
                    }
                    System.out.println("Now playing "+playList.get(currSongInd).toString());
                    break;
                case 3:
                    System.out.println("Now playing "+playList.get(currSongInd).toString());
                    break;
                case 4:
                    Collections.shuffle(playList);
                    break;
                case 5:
                    playList.remove(currSongInd);
                    break;
                case 6:
                    printMenu();
                    break;
                case 7:
                    printPlayList(playList);
                    break;
                case 8:
                    quitApp = true;
                    break;
            }
        }
    }
    public static void printMenu(){
        System.out.println("1. Play next song");
        System.out.println("2. Play previous song");
        System.out.println("3. Repeat the song");
        System.out.println("4. Suffle the playlist");
        System.out.println("5. Delete the current song");
        System.out.println("6. Print the menu");
        System.out.println("7. View the playlist");
        System.out.println("8. Exit the application");
    }
    public static void printPlayList(List<Song>playList){
        for(Song song : playList){
            System.out.println(song.toString());
        }
    }
}