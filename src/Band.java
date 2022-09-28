public class Band {
    public String name;
    public String infoText;
    public int yearOfBandFormed;

    public Band(String name, String infoText, int yearOfBandFormed){
        this.name = name;
        this.infoText = infoText;
        this.yearOfBandFormed = yearOfBandFormed;
    }

    public String getName(){

        return name;
    }

    public String getInfoText(){

        return infoText;
    }
    public int getYearOfBandFormed(){

        return yearOfBandFormed;
    }
}
