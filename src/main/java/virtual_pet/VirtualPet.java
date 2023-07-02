package virtual_pet;
public class VirtualPet {
    
    private String name;

    private int hunger;

    private int thirst;
    
    private int waste;

    private int tick;

    public VirtualPet(String name) {
        this.name = name;
        this.hunger = 50;
        this.thirst = 50;
        this.waste = 50;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHunger() {
        return this.hunger;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getThirst() {
        return this.thirst;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public int getWaste() {
        return this.waste;
    }


    public void feed() {
        this.hunger = this.hunger - 5;
        this.thirst = this.thirst + 3;
        this.waste = this.waste + 5;
    }

    public void water() {
        this.thirst = this.thirst - 5;
        this.waste = this.waste + 7;
    }

    public void waste() {
        this.waste = this.waste - 5;
    }


    public void tick() {
        this.hunger = this.hunger + 2;
        this.thirst = this.thirst + 2;
        this.waste = this.waste + 2; 

    }

}
