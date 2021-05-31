package Extend;

public class Mammal extends animal{
    private boolean canTalk;
    public Mammal(String name, String age) {
        super(name, age);
    }

    public Mammal(String name, String age, boolean canTalk) {
        super(name, age);
        this.canTalk = canTalk;
    }

    public boolean isCanTalk() {
        return canTalk;
    }

    public void setCanTalk(boolean canTalk) {
        this.canTalk = canTalk;
    }


    @Override
    public String toString() {
        String out = "Name :"+super.getName() + "\nAge :" +super.getAge()+"\nCan Talk :"+this.canTalk;
        return out;
    }
}
