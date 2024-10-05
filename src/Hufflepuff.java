public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String studentName, int magic,int transgressionDistance, int hardWork, int loyalty, int honesty) {
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
    public void studentHyfflepuff() {
        System.out.println("Пуффендуй " + getStudentName() + " магия= " + getMagic() + " расстояние трансгрессии= " + getTransgressionDistance() + " трудолюбивость= " + hardWork + " верность= " + loyalty +" честность= " + honesty);
    }
}
