public class Slytherin extends Hogwarts {
    private int cunning;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String studentName, int magic, int transgressionDistance, int cunning, int resoluteness, int ambition, int resourcefulness, int lustForPower) {
        super(studentName, magic, transgressionDistance);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Слизерин " + getStudentName() + ", магия" + getMagic() + ", расстояние трансгрессии=" + getTransgressionDistance() +
                "хитрость= " + cunning +
                ", решительность= " + resoluteness +
                ", амбициозность= " + ambition +
                ", находчивость= " + resourcefulness +
                ", жажда власти= " + lustForPower +
                ' ';
    }

    //Метод вывода данных о студенте
    public void studentSlytherin() {
        System.out.println("Слизерин " + getStudentName() + " магия= " + getMagic() + " расстояние трансгрессии= " + getTransgressionDistance() + " решительность= " + resoluteness + " амбициозность= " + ambition + " находчивость= " + resourcefulness + " жажда власти= " + lustForPower);
    }

    //Метод сравнения студентов одного факультета
    public static void studentComparisonSlytherin(Slytherin comparison1, Slytherin comparison2) {
        int student1 = comparison1.getCunning() + comparison1.getResoluteness() + comparison1.getAmbition() + comparison1.getResourcefulness() + comparison1.getLustForPower();
        int student2 = comparison2.getCunning() + comparison2.getResoluteness() + comparison2.getAmbition() + comparison2.getResourcefulness() + comparison2.getLustForPower();
        if (student1 > student2) {
            System.out.println(comparison1.getStudentName() + " лучший ученик Слизерина, чем " + comparison2.getStudentName());
        } else if (student1 < student2) {
            System.out.println(comparison2.getStudentName() + " лучший ученик Слизерина, чем " + comparison1.getStudentName());
        }
    }
}
