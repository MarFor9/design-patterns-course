package design.patterns.adapter.other.example;


import design.patterns.adapter.other.example.api.LibraryAPI;
import design.patterns.adapter.other.example.api.LibraryAPIImpl;
import design.patterns.adapter.other.example.api.LibraryAPIv2;
import design.patterns.adapter.other.example.api.LibraryAPIv2Impl;

public class Main {

    public static void main(String[] args) {


        LibraryAPI api = new LibraryAPIImpl();

        User user = new User("Paweł","Cwik","32131212");

        BookConnector connector = new BookConnector(user,api);

        connector.checkAviability("Harry Potter i Zakon Feniksa");

        System.out.println("=================================");
        System.out.println("Implementation of new version api");

        User userV2 = new User("Paweł","Cwik","32131212");
        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();

        APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, userV2);
        BookConnector connectorV2 = new BookConnector(userV2,apiAdapter);

        connectorV2.checkAviability("Harry Potter i Zakon Feniksa");

    }

}
