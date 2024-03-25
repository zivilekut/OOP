public class Book {
    private String title;
    private int pages;
    private int releaseYear;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return this.pages;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYea() {
        return this.releaseYear;
    }

    public Book() {

    }

    public Book(String title, int pages, int releaseYear) {
        this.title = title;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }
    @Override
    public String toString(){
        return this.title + " " +
                this.pages + " " +
                this.releaseYear;
    }

}
