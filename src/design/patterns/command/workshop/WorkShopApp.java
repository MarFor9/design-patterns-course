package design.patterns.command.workshop;

import design.patterns.command.workshop.command.Command;

import java.util.ArrayList;
import java.util.List;

public class WorkShopApp {
    private List<Command> commandQueue = new ArrayList<>();

    public void addToQueue(Command command) {
        commandQueue.add(command);
    }

    public void run() {
        if (commandQueue.isEmpty()) {
            System.out.println("Kolejka nie zawiera zadnych komend");
            return;
        }
        commandQueue.forEach(Command::execute);
//        commandQueue.clear();
    }

    public void undoLastCommand() {
        commandQueue.forEach(Command::undo);
    }
}
