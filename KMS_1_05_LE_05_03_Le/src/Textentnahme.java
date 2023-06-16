import java.util.Scanner;

public class Textentnahme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie einen Text mit folgenden Aufbau -> " +
                "derArtikel[Artikelbezeichnung]wurdebestelltvon[besteller]: ");

        String user_input_text = scanner.nextLine();
        String[] user_input_array = user_input_text.split("\\[|\\]");

        System.out.println("Name des Bestellers: "+ user_input_array[3]);
        System.out.println("Bezeichnung des Artikels: "+ user_input_array[1]);

    }
}