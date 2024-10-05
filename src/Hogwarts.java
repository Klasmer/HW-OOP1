public class Hogwarts {
    private String studentName;
    private int magic;
    private int transgressionDistance;

    public Hogwarts(String studentName, int magic, int transgressionDistance) {
        this.studentName = studentName;
        this.magic = magic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Хогвартс " +
                "Студент " + studentName +
                ", магия= " + magic +
                ", расстояние трансгрессии= " + transgressionDistance +
                ' ';
    }

    //Метод Сравнение любых учеников по силе магии и расстоянию трансгрессии
    public static void powerOfMagicTransgressionDistance(Hogwarts student1, Hogwarts student2) {
        int comparison1 = student1.getMagic() + student1.getTransgressionDistance();
        int comparison2 = student2.getMagic() + student2.getTransgressionDistance();
        if (comparison1 > comparison2) {
            System.out.println(student1.getStudentName() + " обладает большей мощностью магии, чем " + student2.getStudentName());
        } else if (comparison1 < comparison2) {
            System.out.println(student2.getStudentName() + " обладает большей мощностью магии, чем " + student1.getStudentName());
        }
    }
}
