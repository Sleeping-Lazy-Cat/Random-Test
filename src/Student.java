public class Student implements Programmer {

    public Student(int javaSkill, int vibe, int bars) {
        this.javaSkill = javaSkill;
        this.vibe = vibe;
        this.bars = bars;
    }

    public Student(int javaSkill, int vibe) {
        this.javaSkill = javaSkill;
        this.vibe = vibe;
        this.bars = 0;
    }

    protected int javaSkill;
    protected int vibe;
    protected int bars;
    boolean skipNext;

    @Override
    public int javaSkillGetter() {
        return javaSkill;
    }

    @Override
    public int vibeGetter() {
        return vibe;
    }

    public void setJavaSkill(int javaSkill) {
        this.javaSkill = javaSkill;
    }

    public void plusVibe(int vibe) {
        this.vibe += vibe;
    }
}
