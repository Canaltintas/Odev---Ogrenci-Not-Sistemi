public class Student {
    Course couseOne;
    Course courseTwo;
    Course courseThree;
    String name;
    String stuNo;
    String classes;

    float avarege;
    Boolean isPass;

    Student(String name,String stuNo,String classes,Course couseOne,Course courseTwo,Course courseThree){
        this.name =name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.couseOne=couseOne;
        this.courseTwo=courseTwo;
        this.courseThree=courseThree;
        this.avarege = 0.0f;
        this.isPass =false;

    }

    void addBulkExamNote(int c1Note,int c2Note,int c3Note ){
        if (c1Note>=0 && c1Note <=100){
            this.couseOne.note =c1Note;
        }
        if (c2Note>=0 && c2Note <=100){
            this.courseTwo.note =c2Note;
        }
        if (c3Note>=0 && c3Note <=100){
            this.courseThree.note = c3Note;
        }

        calcAvarage();

    }
    void calcAvarage(){
        this.avarege = (this.couseOne.note+this.courseTwo.note+this.courseThree.note)/3.0f;
        isPass();
    }

    void isPass(){
        this.isPass = this.avarege >= 55;



    }

    void printNote(){



        System.out.println("\n Öğrencinin Adı :\t"+this.name +
                "\n Öğrencinin numarası : \t"+this.stuNo +
                "\n Öğrencinin Sınıfı : \t"+this.classes +"\n" +
                this.couseOne.name +" Ders Notu :\t"+this.couseOne.note + "\n"+
                this.courseTwo.name +" Ders Notu :\t"+this.courseTwo.note+" \n"+
                this.courseThree.name + " Ders Notu :\t"+courseThree.note+
                "\n Not Ortalaması :\t"+this.avarege);
            if (isPass){
                System.out.println("Dönem Başarılı.");
            }else {
                System.out.println("Dönem Başarısız!");

            }
        System.out.println("********************");

    }

}
