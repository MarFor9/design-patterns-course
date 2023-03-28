package design.patterns.chain.responsibility;

import design.patterns.chain.responsibility.message.Message;
import design.patterns.chain.responsibility.officer.Officer;

public class General extends Officer {
    private static final int CODE = 100;
    private static final String NAME = "General Zaborski";

    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.GENERAL) && message.getCode() == CODE) {
            System.out.println(NAME + " otrzymal wiadomosc." + message.getContent());
        } else {
            System.out.println("Zly adresat wiadomosci lub code szyfrujacy");
        }
    }
}
