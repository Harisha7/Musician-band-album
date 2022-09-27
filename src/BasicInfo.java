public class BasicInfo {
    private String name;
    private String info;
    private int birthYear;

    public BasicInfo(String name, String info, int birthYear) {
        this.name = name;
        this.info = info;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    //Return the birth
    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
