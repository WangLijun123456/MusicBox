public class Main {
    public static void main(String[] args) {

        // First MusicBox object
        MusicBox mbox1 = new MusicBox("S34TG65", 'Y', "Raindrops", "Misty",
                "The path less traveled", "Country", "BZEE Music", "Rhythm Divine", 2);

        System.out.println("Now playing the first song");
        mbox1.playSong();

        // Second MusicBox object
        MusicBox mbox2 = new MusicBox("A67FH29", 'N', "Sunshine", "Sunny",
                "Sunset Dreams", "Pop", "Harmonix Records", "Melody Makers", 1);

        System.out.println("Now playing the second song");
        mbox2.playSong();
    }
}
