public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String studentName, int magic, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(studentName, magic, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Пуффендуй " + getStudentName() + ", магия" + getMagic() + ", расстояние трансгрессии=" + getTransgressionDistance() +
                "трудолюбивость= " + hardWork +
                ", верность= " + loyalty +
                ", честность= " + honesty +
                ' ';
    }

    //Метод вывода данных о студенте
    public void studentHyfflepuff() {
        System.out.println("Пуффендуй " + getStudentName() + " магия= " + getMagic() + " расстояние трансгрессии= " + getTransgressionDistance() + " трудолюбивость= " + hardWork + " верность= " + loyalty + " честность= " + honesty);
    }

    //Метод сравнения студентов одного факультета
    public static void studentComparisonHufflepuff(Hufflepuff comparison1, Hufflepuff comparison2) {
        int student1 = comparison1.getHardWork() + comparison1.getLoyalty() + comparison1.getHonesty();
        int student2 = comparison2.getHardWork() + comparison2.getLoyalty() + comparison2.getHonesty();
        if (student1 > student2) {
            System.out.println(comparison1.getStudentName() + " лучший ученик Пуффендуя, чем " + comparison2.getStudentName());
        } else if (student1 < student2) {
            System.out.println(comparison2.getStudentName() + " лучший ученик Пуффендуя, чем " + comparison1.getStudentName());
        }
    }
}
