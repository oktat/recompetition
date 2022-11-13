/*
 * Nagy János, 2022
 * Copyright (c) 2022-11-13
 * Competition version: 0.0.1
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    static String competitorName;
    static double runinTime;
    static String startNumber;

    public static void main(String[] args) throws Exception {        
        System.out.println("Verseny");
        App.inputCompetitorData();
        App.writeToFile();
    }

    private static void inputCompetitorData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Versenyző név: ");
        App.competitorName = scanner.nextLine();
        System.out.print("Versenyző runinTime: ");
        App.runinTime = Double.parseDouble(scanner.nextLine());
        System.out.print("Versenyző rajtszám: ");
        App.startNumber = scanner.nextLine();
        scanner.close();
    }
    private static void writeToFile() {
        PrintWriter printWriter = null;
        try {
            FileWriter fileWriter = new FileWriter("data.txt", true);
            printWriter = new PrintWriter(fileWriter);
            printWriter.print(App.competitorName);
            printWriter.print(":");
            printWriter.print(App.runinTime);
            printWriter.print(":");
            printWriter.println(App.startNumber);
        } catch (IOException e) {
            System.err.println("Hiba! A fájlba írás sikertelen!");
        }finally {
            printWriter.close();
        }
        
    }
}
