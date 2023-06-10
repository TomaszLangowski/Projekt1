package Model;

public class Head extends BodyPart implements IActionable{
    private int IQ;
    public void doAction() {
        System.out.println(this.getName()+" "+this.getDesc());
        System.out.println("Masz "+this.getIQ()+" IQ");
    }

    public Head()
    {
        this.setName("Głowa");
        this.setDesc("Odpowiada za myślenie i kontrolę zmysłów.");
        this.setIQ(50);
    }

    public Head(String name, String desc, int IQ)
    {
        this.setName(name);
        this.setDesc(desc);
        this.setIQ(IQ);
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }
}