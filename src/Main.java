import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Teacher t1=new Teacher("John Doe","555","MAT");
        Teacher t2=new Teacher("Nataniel Cyrus","555","FZK");
        Teacher t3=new Teacher("Coralie Aviva","555","BİYO");

        Course matematik = new Course("Matematik","101","MAT");
        Course biyoloji = new Course("Biyoloji","101","BİYO");
        Course fizik = new Course("Fizik","101","FZK");

        Student s1= new Student("Milly Adam","0900","1",matematik,fizik,biyoloji);
        Student s2= new Student("Yam St John","0905","2",matematik,fizik,biyoloji);
        Student s3= new Student("Ladislava Zeltzin","0907","3",matematik,fizik,biyoloji);

        matematik.addTeacher(t1);
        biyoloji.addTeacher(t3);
        fizik.addTeacher(t2);

        s1.addBulkExamNote(100,75,82);
        s1.printNote();
        s2.addBulkExamNote(50,57,60);
        s2.printNote();
        s3.addBulkExamNote(45,14,58);
        s3.printNote();






    }
}
