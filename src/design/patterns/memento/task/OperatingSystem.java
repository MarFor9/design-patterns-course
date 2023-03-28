package design.patterns.memento.task;

import java.util.Date;

public class OperatingSystem {
    private int backupNumber;
    private Date backupDate;

    public void createBackup() {
        this.backupNumber++;
        this.backupDate = new Date();
        System.out.println("Utworzono backup nr: " + backupNumber + " z data: " + backupDate);
    }

    public OperatingSystemMemento save() {
        System.out.println("Zapisano backup nr: " + backupNumber + " z data: " + backupDate);
        return new OperatingSystemMemento(backupNumber, backupDate);
    }

    public void load(OperatingSystemMemento memento) {
        this.backupNumber = memento.getBackupNumber();
        this.backupDate = memento.getBackupDate();
        System.out.println("Wczytano backup nr: " + backupNumber + " z data: " + backupDate);
    }
}
