package Model;

public class Butt extends BodyPart implements IActionable{

    public Butt()
    {
        this.setName("Tylek");
        this.setDesc("Dupa: Służy do siadania.");
    }

    public Butt(String name, String desc)
    {
        this.setName(name);
        this.setDesc(desc);
    }
    public void doAction() {

        System.out.println(this.getName());
        System.out.println(this.getDesc());
    }

}