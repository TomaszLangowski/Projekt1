package Controller;

import Model.*;

import java.util.Scanner;

public class BodyPartController {
    public static void DisplayBodyPart(IActionable iActionable)
    {
        iActionable.doAction();
    }

    public static void makeDecision(Butt butt, Hand hand, Head head, Leg leg)
    {
        System.out.println("Wybierz liczbę (1 - Głowa, 2 - Ręka, 3 - Noga, 4 - Dupa):");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                BodyPartController.DisplayBodyPart(head);
                break;
            case 2:
                BodyPartController.DisplayBodyPart(hand);
                break;
            case 3:
                BodyPartController.DisplayBodyPart(leg);
                break;
            case 4:
                BodyPartController.DisplayBodyPart(butt);
                break;
            default:
                System.out.println("Miałeś proste zadanie =;p.");
        }
    }
}
