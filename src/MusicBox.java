public class MusicBox {

    // Variables
    private String songID;
    private char isSongPremium;
    public String songTitle;
    private String songArtists;
    private String songAlbum;
    public String songGenre;
    private String songProducer;
    public String songMusicLabel;
    public int noAds;

    // Constructor
    public MusicBox(String songID, char premiumSong, String title, String artists, String Album, String genre, String producer, String label, int ads) {
        this.songID = songID;
        this.isSongPremium = premiumSong;
        this.songTitle = title;
        this.songArtists = artists;
        this.songAlbum = Album;
        this.songGenre = genre;
        this.songProducer = producer;
        this.songMusicLabel = label;
        this.noAds = ads;
    }
    
    // Getters
    public String getSongID() {
        return songID;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getSongArtists() {
        return songArtists;
    }

    public char getPremiumSong() {
        return isSongPremium;
    }

    public String getSongAlbum() {
        return songAlbum;
    }

    public String getSongGenre() {
        return songGenre;
    }

    public String getSongProducer() {
        return songProducer;
    }

    public String getSongMusicLabel() {
        return songMusicLabel;
    }

    public int getNoAds() {
        return noAds;
    }

    // Methods
    public void playSong() {
        switch(isSongPremium) {
            case 'Y':
                System.out.println("This is a premium song. Please buy it to play without the ads");
                playAd();
                break;
            case 'N':
                System.out.println("Thank you for choosing this song. Hope you enjoy listening to it.");
                playAd();
                break;
        }
    }

    private void playAd() {
        if (noAds == 1) {
            System.out.println("Playing Ad 1");
        } else {
            for (int i = 1; i <= noAds; i++) {
                System.out.println("Playing Ad " + i);
            }
        }
    }
}
