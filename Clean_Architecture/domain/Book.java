package Homeworks.Clean_Architecture.domain;

/**
 * Класс Book представляет книгу в магазине.
 */
public class Book {
    private String id;
    private String title;
    private String author;
    private double price;

      /**
     * Создает новый экземпляр класса Book
     * @param id идентификатор книги
     * @param title название книги
     * @param author автор книги
     * @param price цена книги
     */
    public Book(String id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }


}
