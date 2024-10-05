public class Slytherin extends Hogwarts {
    private int cunning;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String studentName, int magic,int transgressionDistance, int cunning, int resoluteness, int ambition, int resourcefulness, int lustForPower) {
        super(studentName, magic,transgressionDistance);
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
    public void studentSlytherin(){
        System.out.println("Слизерин " + getStudentName() + " магия= " + getMagic() + " расстояние трансгрессии= " + getTransgressionDistance() + " решительность= " + resoluteness + " амбициозность= " + ambition +" находчивость= " + resourcefulness + " жажда власти= " + lustForPower);
    }
}
