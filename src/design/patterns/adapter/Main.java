package design.patterns.adapter;

import design.patterns.adapter.twoway.TwoWayAdapter;


// using adapter pattern we can use to different interfaces together
// we can adapt UKSocket (gniazdo) with Continental socket.
public class Main {
    public static void main(String[] args) {
        // in Poland, we use different socket than in UK
        PolandSocket polandSocket = new PolandSocket();
        PolandDevice continentalRadio = () -> System.out.println("Play music in Poland socket");
        polandSocket.plugIn(continentalRadio);

        UKSocket ukSocket = new UKSocket();
        UKDevice ukRadio = () -> System.out.println("Play music in UK Socket");
        ukSocket.plugIn(ukRadio);

        System.out.println("================================================");
        System.out.println("Adapt UK socket to Poland socket: ");
        UKToPolandAdapter adapter = new UKToPolandAdapter(ukRadio);
        polandSocket.plugIn(adapter);

        System.out.println("================================================");
        System.out.println("using two way adapter:");

        TwoWayAdapter twoWayAdapter = new TwoWayAdapter(ukRadio, continentalRadio);
        polandSocket.plugIn(twoWayAdapter);
        ukSocket.plugIn(twoWayAdapter);

        System.out.println("================================================");
    }
}
