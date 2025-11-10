package workout;

public class Notebook {
    Notebook() {
    }
    public int size;
    public String color;
    private String page;

    public void write(String text) {
       page = text;
    }

    public String read() {
        return page;
    }
}
