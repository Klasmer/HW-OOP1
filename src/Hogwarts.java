public class Hogwarts {
    private String studentName;
    private int magic;
    private int transgressionDistance;

    public Hogwarts(String studentName, int magic, int transgressionDistance) {
        this.studentName = studentName;
        this.magic = magic;
        this.transgressionDistance= transgressionDistance;
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
                "Студент " + studentName  +
                ", магия= " + magic +
                ", расстояние трансгрессии= " + transgressionDistance +
                ' ';
    }
}
