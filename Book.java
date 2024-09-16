public class Book {
    public String tittle;
    public String author;
    private String isbn;
    int copiesavailable;

    public Book(String tittle, String author, String isbn, int copiesavailable ) {
        this.tittle=tittle;
        this.author=author;
        this.isbn=isbn;
        this.copiesavailable=copiesavailable;
    }
public String getisbn(){
        return isbn;
}
public int setcopiesavailable(int copies){
        copiesavailable=copies;
        return copiesavailable;
}
int getcopiesavailable(){
        return copiesavailable;
}
}
