package week2.technicalContent3.StudentInfoSystem;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int writtenExamGrade;
    int verbalExamGrade;
    float writtenExamEffect;
    float verbalExamEffect;

    public Course(
            String name,
            String code,
            String prefix,
            float writtenExamEffect,
            float verbalExamEffect) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.writtenExamEffect = writtenExamEffect;
        this.verbalExamEffect = verbalExamEffect;
        this.verbalExamGrade = 0;
        this.writtenExamGrade = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
