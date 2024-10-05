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
    //Метод вывода данных о студенте
    public void studentRavenclaw(){
        System.out.println("Когтевран " + getStudentName() + " магия= " + getMagic() + " расстояние трансгрессии= " + getTransgressionDistance() + " умен= " + mind + " мудрость= " + wisdom + " креативность= " + creation);
    }
    //Метод сравнения студентов одного факультета
    public static void studentComparisonRavenclaw(Ravenclaw comparison1, Ravenclaw comparison2){
        int student1 = comparison1.getMind() + comparison1.getWisdom() + comparison1.getCreation();
        int student2 = comparison2.getMind() + comparison2.getWisdom() + comparison2.getCreation();
        if (student1 > student2){
            System.out.println(comparison1.getStudentName() + " лучший ученик Когтевранца, чем " + comparison2.getStudentName());
        } else if (student1 < student2) {
            System.out.println(comparison2.getStudentName() + " лучший ученик Когтевранца, чем " + comparison1.getStudentName());

        }
    }
}
