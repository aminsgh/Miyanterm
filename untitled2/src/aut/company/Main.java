package aut.company;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

            ClockDisplay clockDisplay=new ClockDisplay(11,20);
         System.out.println(clockDisplay.getTime() );
         clockDisplay.timeTick();
         System.out.println(clockDisplay.getTime() );
         System.out.println(clockDisplay.getTime() );

         MusicCollection jazz =new MusicCollection();
         MusicCollection pop =new MusicCollection();
         MusicCollection rock =new MusicCollection();
         MusicCollection country =new MusicCollection();
         MusicCollection[] categories=new MusicCollection[4];
         categories[0]=jazz;
         categories[1]=pop;
         categories[2]=rock;
         categories[3]=country;

         jazz.addFile("jazz.a");
         jazz.addFile("jazz.b");
         jazz.addFile("jazz.c");
         pop.addFile("pop.a");
         pop.addFile("pop.b");
         pop.addFile("pop.c");
         rock.addFile("rock.a");
         rock.addFile("rock.b");
         rock.addFile("rock.c");
         country.addFile("country.a");
         country.addFile("country.b");
         country.addFile("country.c");

         jazz.startPlaying(2);
         jazz.stopPlaying();
         pop.startPlaying(1);
         pop.stopPlaying();





    }
}
