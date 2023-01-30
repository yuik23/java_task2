public class Ramen {
    private final String taste;

    private final Integer price;

    private Integer kaedama;

    public Ramen(String taste, Integer price, Integer kaedama) {
        this.taste = taste;
        this.price = price;
        this.kaedama = kaedama;
    }

    public String getTaste() {
        return taste;
    }

    public Integer getPrice() {

        return price;
    }

    public Integer getKaedama() {

        return kaedama;
    }

    public void setKaedama(Integer kaedama) {

        this.kaedama = kaedama;
    }
}
