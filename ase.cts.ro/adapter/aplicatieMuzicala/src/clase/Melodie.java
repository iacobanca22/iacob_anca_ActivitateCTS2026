package clase;

public class Melodie {
    private String nume;
    private String artist;
    private String durata;

    public Melodie(String nume, String artist, String durata) {
        this.nume = nume;
        this.artist = artist;
        this.durata = durata;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public String getNume() {
        return nume;
    }

    public String getArtist() {
        return artist;
    }

    public String getDurata() {
        return durata;
    }

    @Override
    public String toString() {
        return "Melodie{" +
                "nume='" + nume + '\'' +
                ", artist='" + artist + '\'' +
                ", durata='" + durata + '\'' +
                '}';
    }

    public void play() {
        System.out.println("Playing: " + nume + " by " + artist);
    }

    public String getInfo() {
        return "Melodie: " + nume + " | Artist: " + artist + " | Durata: " + durata;
    }
}
