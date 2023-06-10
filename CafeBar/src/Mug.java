import java.util.Objects;

public class Mug extends BaseMerchandise implements Merchandise {
    String feature;
    double price;
    public String toString(){
        return "Mug";
    }
    public String getFeature(){
        feature = "Mug is Red ";
        return feature;
    }

    @Override
    public double getPrice() {
        price= 5.0;
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mug mug = (Mug) o;
        return Double.compare(mug.price, price) == 0 && Objects.equals(feature, mug.feature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feature, price);
    }
}
