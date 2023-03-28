package design.patterns.command;


// command pattern in Polish polecenie
// we use it for encapsulation object which will be sent
// can be used to create a queue of commands, logging that commands or to come back last operation

// wzor polecenie
// uzywamy do enkapsulacji obiektu ktory bedzie wysylany
// mozemy go uzyc do stworzenia kolejki polecen, logowania polecen lub cofnac ostatnia operacje
// wady - kazda osobna komenda powinna byc tworzona w osobnej klasie

import design.patterns.command.workshop.Robot;
import design.patterns.command.workshop.WorkShopApp;
import design.patterns.command.workshop.command.*;

public class Main {
    public static void main(String[] args) {
        WorkShopApp workShopApp = new WorkShopApp();
/*        Command turnOn = new RobotTurnOnCommand(new Robot());
        Command turnOff = new RobotTurnOffCommand(new Robot());
        Command turnDrill = new RobotDrillCommand(new Robot());
        Command turnCut = new RobotCutCommand(new Robot());

        workShopApp.addToQueue(turnOn);
        workShopApp.addToQueue(turnOff);
        workShopApp.addToQueue(turnDrill);
        workShopApp.addToQueue(turnCut);

        workShopApp.run();

        workShopApp.run();

        Command expressTurnOn = new CoffeeMakerTurnOnCommand(new CoffeeMaker());
        Command expressTurnOff = new CoffeeMakerTurnOffCommand(new CoffeeMaker());

        workShopApp.addToQueue(expressTurnOn);
        workShopApp.addToQueue(expressTurnOff);
        workShopApp.run();*/

        Robot robot = new Robot();
        workShopApp.addToQueue(new RobotTurnOnCommand(robot));
        workShopApp.run();
        workShopApp.undoLastCommand();
    }
}
