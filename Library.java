import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private static List<Book> books;
    private static List<member> members;
    private static String memberId;

    public library() {
        books = new ArrayList<Book>();
        members = new ArrayList<member>();

    }
    public static void addBook(Book book) {
        books.add(book);
    }
    public static void registerMembers(member member) {
        members.add(member);
    }
    public static void lendBook(String ISBN, String memberId) {
        Book book = findBook(ISBN);
        Member member = (Member) findMember();
        if (book != null && member != null && book.getCopiesAvailable() > 0) {
            ((member) member).borrowBook(book);
            book.setCopiesAvailable(book.getCopiesAvailable() - 1);
        }
        private static Book findBook(String ISBN) {
            for (Book book : books) {
                if (book.getISBN().equals(ISBN)) {
                    return book;
                }
            }
            return null;
            private static member findMember() {
                for (member member : members) {
                    if (member.getMemberId().equals(memberId)){
                        return member;
                    }
                }
                return null;


    }
