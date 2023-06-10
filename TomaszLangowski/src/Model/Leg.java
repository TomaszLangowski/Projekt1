package Model;

public class Leg extends BodyPart implements IActionable{
    public void doAction() {
        System.out.println(this.getName()+" "+this.getDesc());
    }

    public Leg()
    {
        this.setName("Noga");
        this.setDesc("Umożliwia poruszanie się i wykonywanie różnych czynności związanych z chodzeniem, bieganiem itp.");
    }

    public Leg(String name, String desc)
    {
        this.setName(name);
        this.setDesc(desc);
    }
}