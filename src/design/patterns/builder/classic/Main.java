package design.patterns.builder.classic;

public class Main {
    public static void main(String[] args) {
        FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles")
                .price(50)
                .build();
        System.out.println(leg);

        FlightLeg leg1 = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles") // here we input only mandatory fields
                .from("Las Vegas") // not mandatory - optional
                .to("Los Angeles") // not mandatory - optional
                .price(40) // if lack price() method then will be thrown error
                .build();

        System.out.println(leg1);
    }
}
