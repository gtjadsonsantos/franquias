package franquias.models;

public class Franchise {
    private String name;
    private String description;
    private Object image;
    private Restaurant[] restaurants;

    public Franchise() {}
    
    public Franchise(String name, String description, Object image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Object getImage() {
        return image;
    }
    public void setImage(Object image) {
        this.image = image;
    }

    public Restaurant[] getRestaurants() {
        return restaurants;
    }
    public void setRestaurants(Restaurant[] restaurants) {
        this.restaurants = restaurants;
    }

    

}
