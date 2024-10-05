public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int ingenious;
    private int creation;

    public Ravenclaw(String studentName, int magic,int mind, int wisdom, int ingenious, int creation) {
        super(studentName, magic);
        this.mind = mind;
        this.wisdom = wisdom;
        this.ingenious = ingenious;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getIngenious() {
        return ingenious;
    }

    public void setIngenious(int ingenious) {
        this.ingenious = ingenious;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
}
