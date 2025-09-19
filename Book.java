public class Book {
    private String bookId;
    private String title;
    private double price;
    private double discount;
    public Book(String bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.price = 0;
        this.discount = 0;
    }
    public Book(String bookId, String title, double price, double discount) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.discount = discount;
    }
    public String getBookId() {
        return bookId;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double salePrice() {
        return Math.max(price - discount, 0);
    }
    public void printInfo() {
        System.out.println("Thong tin sach:");
        System.out.println("- Ma sach: " + bookId);
        System.out.println("- Ten sach: " + title);
        System.out.println("- Gia: " + (long)price);
        System.out.println("- Giam gia: " + (long)discount);
    }
}
