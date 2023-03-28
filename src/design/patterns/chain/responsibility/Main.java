package design.patterns.chain.responsibility;

import design.patterns.chain.responsibility.message.Message;
import design.patterns.chain.responsibility.officer.Officer;


// lanuch dowodzenia
public class Main {
    public static void main(String[] args) {
        Message message = new Message(" Atakowac!", 10, OfficerRank.SERGEANT);

        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        sergeant.processMessage(message);

    }
}
