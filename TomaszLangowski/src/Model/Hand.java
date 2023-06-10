package Model;

public class Hand extends BodyPart implements IActionable{
    private int fingers;
    public void doAction() {
        System.out.println(this.getName()+" "+this.getDesc());
        System.out.println("Posiada: "+this.getFingers());
    }

    public Hand(String name, String desc, int fingers)
    {
        this.setName(name);
        this.setDesc(desc);
        this.setFingers(fingers);
    }

    public Hand()
    {
        this.setName("Reka");
        this.setDesc("Ręka: Służy do wykonywania różnych czynności i manipulowania przedmiotami.");
        this.setFingers(5);
    }

    public int getFingers() {
        return fingers;
    }

    public void setFingers(int fingers) {
        this.fingers = fingers;
    }
}
