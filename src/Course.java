public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    Course(String name,String code,String prefix){

        this.name = name;
        this.code = code;
        this.prefix = prefix;

    }

   void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
           this.teacher = teacher;
        }else {
            System.out.println("Girilen öğretmen ,seçilen ders ile uyumlu değil!");
        }
    }
    void printTeacher(){
        System.out.println("\n Öğretmen Adı :\t"+this.teacher.name +"\n Branşı :\t"+
                this.teacher.branch + "\n Girilen Dersler :\t " + this.name + " "+this.code);
    }

}
