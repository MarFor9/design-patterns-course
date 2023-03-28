package design.patterns.chain.responsibility.task;

public class Tomek extends Child {

    @Override
    public void processRequest(MotherRequest request) {
        if (request.getShelf().equals(Shelf.MEDIUM)) {
            System.out.println("Tomek zdjela sloik z polkami");
        }else {
            tallerChild.processRequest(request);
        }
    }
}
