import java.util.Objects;

public class CoffeePowder  extends BaseMerchandise implements Merchandise{

    String feature;
    double price;
    public String toString(){
        return "Coffee";
    }
    public String getFeature(){
        feature = "Coffee is Amazing ";
        return feature;
    }

    @Override
    public double getPrice() {
        price= 2.5;
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoffeePowder that = (CoffeePowder) o;
        return Double.compare(that.price, price) == 0 && Objects.equals(feature, that.feature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feature, price);
    }
}
