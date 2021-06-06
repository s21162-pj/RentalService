package pl.pjatk.robbrz.model;


public class Movie {
    private Long id;
    private String name;
    private Category category;
    private boolean available = false;

    public Movie(Long id, String name, Category category, boolean available) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.available = available;
    }

    public Movie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean getAvailable() { return available; }

    public void setAvailable(boolean available) { available = available; }
}
