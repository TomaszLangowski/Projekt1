import java.util.Scanner;

import Controller.BodyPartController;
import Model.*;

public class Main {
    public static void main(String[] args) {
        Head head = new Head();
        Hand hand = new Hand();
        Leg leg = new Leg();
        Butt butt = new Butt();

        Head secHead = new Head("Moja piekna glowa", "Umysl giganta", 150);
        Hand secHand = new Hand("Lewa reka", "A może prawa reka", 4);
        Leg secLeg = new Leg("Prawa noga", "Sam sie jej boje");
        Butt secButt = new Butt("Ulany dupa", "Dupa jak dupa nic ciekawego");

        BodyPartController.makeDecision(butt, hand, head, leg);
        BodyPartController.makeDecision(secButt, secHand, secHead, secLeg);
    }
}