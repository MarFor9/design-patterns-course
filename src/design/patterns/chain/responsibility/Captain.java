package design.patterns.chain.responsibility;

import design.patterns.chain.responsibility.message.Message;
import design.patterns.chain.responsibility.officer.Officer;

public class Captain extends Officer {
    private static final int CODE = 50;
    private static final String NAME = "Kapitan Rostkowski";

    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.CAPTAIN) && message.getCode() == CODE) {
            System.out.println(NAME + " otrzymal wiadomosc." + message.getContent());
        } else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
