import java.util.Objects;

public class HockeyCards extends BaseMerchandise implements Merchandise{
    String feature;
    double price;
    public String toString(){
        return "HockeyCard";
    }
    public String getFeature(){
        feature = "HockeyCard is having 30.00 $";
        return feature;
    }

    @Override
    public double getPrice() {
        price= 30.0;
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HockeyCards that = (HockeyCards) o;
        return Double.compare(that.price, price) == 0 && Objects.equals(feature, that.feature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feature, price);
    }
}
