public class Plant {
    private String name;
    private String nameLatin;
    private boolean oneYear;
    private String continent;
    private double height;
    private boolean eatable;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setNameLatin(String nameLatin) {
        this.nameLatin = nameLatin;
    }

    public String getNameLatin() {
        return this.nameLatin;
    }

    public void setOneYear(boolean oneYear) {
        this.oneYear = oneYear;
    }

    public boolean getOneYear() {
        return this.oneYear;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getContinent() {
        return this.continent;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    public boolean getEatable() {
        return this.eatable;
    }

    public Plant() {

    }

    public Plant(String name, String nameLatin, boolean oneYear, String continent, double height, boolean eatable) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.oneYear = oneYear;
        this.continent = continent;
        this.height = height;
        this.eatable = eatable;
    }

    public String toString() {
        return this.name + " " +
                this.nameLatin + " " +
                this.oneYear + " " +
                this.continent + " " +
                this.height + " " +
                this.eatable;
    }
}
