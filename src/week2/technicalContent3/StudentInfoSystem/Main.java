package week2.technicalContent3.StudentInfoSystem;

public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT",0.95F,0.5F);
        Course fizik = new Course("Fizik", "FZK101", "FZK", 0.8F, 0.2F);
        Course kimya = new Course("Kimya", "KMY101", "KMY",0.75F,0.25F);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkWrittenExamGrade(50,60,40);
        s1.addBulkVerbalExamGrade(65,90,75);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkWrittenExamGrade(100,50,40);
        s2.addBulkVerbalExamGrade(45,90,65);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkWrittenExamGrade(50,20,40);
        s3.addBulkVerbalExamGrade(10,1,2);
        s3.isPass();

    }
}
