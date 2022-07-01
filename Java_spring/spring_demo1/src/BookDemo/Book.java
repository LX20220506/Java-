package BookDemo;

public class Book {


    private String name;


    public Book(String name) {
        this.name = name;
    }

    public Book(){

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
