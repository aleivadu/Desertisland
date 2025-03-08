import java.util.Arrays;
import java.util.ArrayList;
public class Playlist {
    String[] favoriteSongs = new String[10];
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    public Playlist () {
        favoriteSongs[0] = "lyris - call me maybe";
        favoriteSongs[1] = "farid - cautivo en tus redes";
        favoriteSongs[2] = "dario gomez - entre comillas";
        favoriteSongs[3] = "diomedes diaz - parranda ron y muje";
        favoriteSongs[4] = "kevin flores - la vecina";
        favoriteSongs[5] = "shakira - loba";
        favoriteSongs[6] = "ricardo arjona - dos extraños";
        favoriteSongs[7] = "vicente fernadez - la penca";
        favoriteSongs[8] = "alejandro fernandez - matalas";
        favoriteSongs[9] = "charrito negro - el ultimo adios";


        desertIslandPlaylist.add("silvestre dangon - culpa de quien");
        desertIslandPlaylist.add("farid ortiz - el rey de los pueblos");
        desertIslandPlaylist.add("el afinaito - los trapitos");
        desertIslandPlaylist.add("ivan villazon - amor de olvido");
        desertIslandPlaylist.add("manuel turizzo - besame");

        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
        desertIslandPlaylist.remove("silvestre dangon - culpa de quien");
        desertIslandPlaylist.remove("ivan villazon - amor de olvido");
        desertIslandPlaylist.remove(0);
        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(3);
        desertIslandPlaylist.remove(4);
        desertIslandPlaylist.remove(5);
        desertIslandPlaylist.remove(6);
        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(1);

        int songA = desertIslandPlaylist.indexOf("el afinaito - los trapitos");
        int songB = desertIslandPlaylist.indexOf("diomedes diaz - parranda ron y muje");

        String tempA = desertIslandPlaylist.get(songA);
        desertIslandPlaylist.set(songA, desertIslandPlaylist.get(songB));
        desertIslandPlaylist.set(songB, tempA);







    }
    public void playSongs(){
        System.out.println("first three songs of favorite list:");
        System.out.println("\t-" + favoriteSongs[0]);
        System.out.println("\t-" + favoriteSongs[1]);
        System.out.println("\t-" + favoriteSongs[2]);
        System.out.println("songs for a desert Island");
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
    }


    }

