import java.util.Objects;

public class GiftCards extends BaseMerchandise implements Merchandise {
    String feature;
    double price;
    public String toString(){
        return "GiftCard";
    }
    public String getFeature(){
        feature = "GiftCard is 20.00$ ";
        return feature;
    }

    @Override
    public double getPrice() {
        price= 20.0;
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GiftCards giftCards = (GiftCards) o;
        return Double.compare(giftCards.price, price) == 0 && Objects.equals(feature, giftCards.feature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feature, price);
    }
}
