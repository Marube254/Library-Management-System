import java. util.Scanner;

public class Main {
    public static void main(String[] args) {
        library library1 = new library();

        Book book1;
        book1 = new Book("Power", "Caleb", "123456789", 5);
        Book book2;
        book2 = new Book("Life", "Nzabb", "987654321", 34);
        library.addBook(book1);
        member member1 = new member("Bless", "M001");
        member member2 = new member("Sam", "M002");

        library.registerMembers(member1);
        library.registerMembers(member2);

        library.lendBook("123456789", "M001");
        library.lendBook("987654321", "M002");
    }


    }
