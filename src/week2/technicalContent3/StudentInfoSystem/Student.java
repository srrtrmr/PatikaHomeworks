package week2.technicalContent3.StudentInfoSystem;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkWrittenExamGrade(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.writtenExamGrade = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.writtenExamGrade = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.writtenExamGrade = kimya;
        }

    }

    public void addBulkVerbalExamGrade(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.verbalExamGrade = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.verbalExamGrade = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.verbalExamGrade = kimya;
        }

    }

    public void isPass() {
        if (this.mat.verbalExamGrade == 0 || this.fizik.verbalExamGrade == 0 || this.kimya.verbalExamGrade == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        float fizik = (this.fizik.writtenExamGrade * this.fizik.writtenExamEffect) + (this.fizik.verbalExamGrade * this.fizik.verbalExamEffect);
        float mat = (this.mat.writtenExamGrade * this.mat.writtenExamEffect) + (this.mat.verbalExamGrade * this.mat.verbalExamEffect);
        float kimya = (this.kimya.writtenExamGrade * this.kimya.writtenExamEffect) + (this.kimya.verbalExamGrade * this.kimya.verbalExamEffect);
        this.avarage = (fizik + mat +kimya) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + ((this.mat.writtenExamGrade * this.mat.writtenExamEffect) + (this.mat.verbalExamGrade * this.mat.verbalExamEffect)));
        System.out.println("Fizik Notu : " + ((this.fizik.writtenExamGrade * this.fizik.writtenExamEffect) + (this.fizik.verbalExamGrade * this.fizik.verbalExamEffect)));
        System.out.println("Kimya Notu : " + ((this.kimya.writtenExamGrade * this.kimya.writtenExamEffect) + (this.kimya.verbalExamGrade * this.kimya.verbalExamEffect)));
    }

}