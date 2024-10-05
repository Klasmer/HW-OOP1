public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String studentName, int magic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(studentName, magic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Гриффиндор " + getStudentName() + ", магия" + getMagic() + ", расстояние трансгрессии=" + getTransgressionDistance() +
                "благородство= " + nobility +
                ", честь= " + honor +
                ", храбрость= " + bravery +
                ' ';
    }

    public void studentGriffindor() {
        System.out.println("Гриффиндор " + getStudentName() + " магия= " + getMagic() + " расстояние трансгрессии= " + getTransgressionDistance() + " благородство= " + nobility + " честь= " + honor + " храбрость= " + bravery);
    }
}
