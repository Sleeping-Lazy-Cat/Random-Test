public class Homework implements Event {

    @Override
    public String getDetails() {
        return "You can try to sdat' and sdelat' hw";
    }


    Complexity complexity;
    Student student;

    public Homework(Complexity complexity, Student student) {
        this.complexity = complexity;
        this.student = student;
    }


    float var = (float) (Math.random() * student.javaSkillGetter() / 100000.20);
    boolean isItComplitied = var > 0.3;


    public void tryToMake() {
        if (isItComplitied) {
            student.plusVibe(10);
        } else {
            student.plusVibe(-10);
        }
        if (complexity == Complexity.HARD) {
            student.setJavaSkill(student.javaSkill + 100);
        } else if (complexity == Complexity.NORMAL) {
            student.setJavaSkill(student.javaSkill + 50);
        } else {
            student.setJavaSkill(student.javaSkill + 30);
        }
    }


}
