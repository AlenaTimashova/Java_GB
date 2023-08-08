package Homeworks.Clean_Architecture.data;

import Homeworks.Clean_Architecture.domain.Book;
import java.util.List;

public interface BookRepository {

    /**
     * Добавляет новый товар - книгу в репозиторий.
     *
     * @param book книга для добавления.
     */
    void addBook(Book book);

    /**
     * Удаляет товар - книгу из репозитория.
     * @param book книга, которую надо удалить
     */
    void removeBook(Book book);

    /**
     * Получает все товары из репозитория.
     *
     * @return список всех товаров.
     */
    List<Book> getAllBooks();
}
