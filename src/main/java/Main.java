import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the name of a planet: ");
        String planetName; // название планеты
        Scanner scanner = new Scanner(System.in); // для ввода названия планеты с клавиатуры
        planetName = scanner.nextLine().toLowerCase(); // toLowerCase(), т. к. регистр не важен

        switch (planetName) {
            case "mercury":
                Planet.MERCURY.printInfo();
                break;
            case "venus":
                Planet.VENUS.printInfo();
                break;
            case "earth":
                Planet.EARTH.printInfo();
                break;
            case "mars":
                Planet.MARS.printInfo();
                break;
            case "jupiter":
                Planet.JUPITER.printInfo();
                break;
            case "saturn":
                Planet.SATURN.printInfo();
                break;
            case "uranus":
                Planet.URANUS.printInfo();
                break;
            case "neptune":
                Planet.NEPTUNE.printInfo();
                break;
            case "pluto":
                Planet.PLUTO.printInfo();
                break;
            default:
                System.out.println("No information available.");
        }
    }
}
