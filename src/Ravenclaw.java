public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int ingenious;
    private int creation;

    public Ravenclaw(String studentName, int magic, int transgressionDistance, int mind, int wisdom, int ingenious, int creation) {
        super(studentName, magic, transgressionDistance);
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

    @Override
    public String toString() {
        return "Когтевранец " + getStudentName() + ", магия" + getMagic() + ", расстояние трансгрессии=" + getTransgressionDistance() +
                "умен= " + mind +
                ", мудрость= " + wisdom +
                ", остроумность= " + ingenious +
                ", креативность= " + creation +
                ' ';
    }
    public void studentRavenclaw(){
        System.out.println("Когтевран " + getStudentName() + " магия= " + getMagic() + " расстояние трансгрессии= " + getTransgressionDistance() + " умен= " + mind + " мудрость= " + wisdom + " креативность= " + creation);
    }
}
