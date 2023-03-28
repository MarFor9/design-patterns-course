package design.patterns.chain.responsibility;

import design.patterns.chain.responsibility.message.Message;
import design.patterns.chain.responsibility.officer.Officer;

public class Sergeant extends Officer {
    private static final int CODE = 10;
    private static final String NAME = "Sierzant Kowalski";

    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.SERGEANT) && message.getCode() == CODE) {
            System.out.println(NAME + " otrzymal wiadomosc." + message.getContent());
        } else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
