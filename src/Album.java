public class Album {
    public String name;
    public String infoText;
    public int yearOfAlbumReleased;

    public Album(String name, String infoText, int yearOfAlbumReleased){
        this.name = name;
        this.infoText = infoText;
        this.yearOfAlbumReleased = yearOfAlbumReleased;
    }

    public String getName(){

        return name;
    }

    public String getInfoText(){

        return infoText;
    }
    public int getYearOfAlbumReleased(){

        return yearOfAlbumReleased;
    }
}
