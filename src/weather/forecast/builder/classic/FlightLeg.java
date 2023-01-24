package weather.forecast.builder.classic;

public class FlightLeg {

    private final String from;
    private final String to;
    private boolean delayed = false;
    private Double price;

    private FlightLeg(FlightLegBuilder builder) {

        this.from = builder.from;
        this.to = builder.to;
        this.delayed = builder.delayed;
        this.price = builder.price;
    }

    public static class FlightLegBuilder {
        private String from;
        private String to;
        private boolean delayed = false;
        private Double price;

        public FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
        }

        public FlightLegBuilder from(String from) {
            this.from = from;
            return this;
        }

        public FlightLegBuilder to(String to) {
            this.to = to;
            return this;
        }

        public FlightLegBuilder price(double price) {
            this.price = price;
            return this;
        }

        public FlightLeg build() {
            if (price == null) {
                throw new IllegalStateException("Brak wymaganego pola - cena");
            }

            return new FlightLeg(this);
        }
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public boolean isDelayed() {
        return delayed;
    }

    public double getPrice() {
        return price;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }
}
