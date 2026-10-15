import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    boolean isRunning = true;
    String choice;
    private AlarmSystem alarmSystem;


    public Menu(AlarmSystem alarmSystem) {
        this.alarmSystem = alarmSystem;
    }


    public void startMenu() {
        alarmSystem.addAllSensors();
        {
            while (isRunning) {
                System.out.println("*****Sensormeny*****");
                System.out.println("1. Visa status");
                System.out.println("2. Visa alla sensorer");
                System.out.println("3. Aktivera larmsystem");
                System.out.println("4. Stäng av larmsystem");
                System.out.println("5. Utlös sensor");
                System.out.println("6. Återställ alla sensorer");
                System.out.println("7. Avsluta");
                System.out.println("********************");
                System.out.print("Ditt val: ");
                choice = scanner.nextLine();
                switch (choice) {
                    case "1" -> alarmSystem.printStatus();
                    case "2" -> alarmSystem.showAllSensors();
                    case "3" -> alarmSystem.arm();
                    case "4" -> alarmSystem.disarm();
                    case "5" -> {
                        System.out.println("Ange sensor-ID: ");
                        String id = scanner.nextLine();
                        alarmSystem.triggerById(id);
                    }
                    case "6" -> alarmSystem.resetAll();
                    case "7" -> {
                        isRunning = false;
                        System.out.println("Programmet avslutas");
                    }
                    default -> System.out.println("Ogiltigt val");
                }
            }
        }
    }
}
