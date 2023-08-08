package Homeworks.Clean_Architecture.data;

import Homeworks.Clean_Architecture.domain.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Класс InMemoryBookRepository представляет реализацию интерфейса BookRepository,
 * использующую коллекцию для хранения товаров-книг.
 */

public class InMemoryBookRepository implements BookRepository {
    private List<Book> books;

    /**
     * Создает новый экземпляр класса InMemoryProductRepository.
     */

    public InMemoryBookRepository() {
        books = new ArrayList<>();;
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book existingBook = iterator.next();
            if (existingBook.getId() == book.getId()) {
                iterator.remove();
                return;
            }
        }
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }
}
