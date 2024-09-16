import java.util.List;
public class Member {
    public String name;
    private String memberId;
    private List<Book> borroweredBooks;
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;

    }
    public String getMemberId(){
        return memberId;
    }
    public void borrrowbook(Book book){
        borroweredBooks.add(book);
    }
    private void addBooktoBorroweredbooks() {
        borroweredBooks.add(book);
    }
}
