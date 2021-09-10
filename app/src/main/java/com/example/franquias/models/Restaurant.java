package franquias.models;

public class Restaurant {
    private String name;
    private String address;
    private String city;
    private Object image;
    public Restaurant() {
    }
    public Restaurant(String name, String address, String city, Object image) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.image = image;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public Object getImage() {
        return image;
    }
    public void setImage(Object image) {
        this.image = image;
    }

    
}

