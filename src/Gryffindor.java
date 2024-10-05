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

//Метод вывода данных о студенте
    public void studentGryffindor() {
        System.out.println("Гриффиндор " + getStudentName() + " магия= " + getMagic() + " расстояние трансгрессии= " + getTransgressionDistance() + " благородство= " + nobility + " честь= " + honor + " храбрость= " + bravery);
    }

    //Метод сравнения студентов одного факультета
    public static void studentСomparisonGryffindor(Gryffindor comparison1, Gryffindor comparison2) {
        int student1 = comparison1.getNobility() + comparison1.getHonor() + comparison1.getBravery();
        int student2 = comparison2.getNobility() + comparison2.getHonor() + comparison2.getBravery();
        if (student1 > student2){
            System.out.println(comparison1.getStudentName() + " лучший ученик Гриффиндора, чем " + comparison2.getStudentName());
        } else if (student1 < student2)
            System.out.println(comparison2.getStudentName() + " лучший ученик Гриффиндора, чем " + comparison1.getStudentName());

    }

}
