public class Plant {
    private String name;
    private String nameLatin;
    private boolean isAnnual;
    private String continent;
    private double height;
    private boolean isEdible;

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

    public void setIsAnnual(boolean isAnnual) {
        this.isAnnual = isAnnual;
    }

    public boolean getIsAnnual() {
        return this.isAnnual;
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
        this.isEdible = eatable;
    }

    public boolean getEatable() {
        return this.isEdible;
    }

    public Plant() {

    }

    public Plant(String name, String nameLatin, boolean isAnnual, String continent, double height, boolean eatable) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.isAnnual = isAnnual;
        this.continent = continent;
        this.height = height;
        this.isEdible = eatable;
    }
    @Override
    public String toString() {
        return this.name + " " +
                this.nameLatin + " " +
                (this.isAnnual ? "Annual" : "Multiyear") + " " +
                this.continent + " " +
                this.height + " " +
                (this.isEdible ? "Eatable" : "Not eatable");
    }
}
