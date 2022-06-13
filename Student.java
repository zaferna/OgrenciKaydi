import java.sql.SQLOutput;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stdno;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stdno, String classes,Course c1,Course c2 , Course c3){

        this.name = name;
        this.stdno= stdno;
        this.classes= classes;
        this.c1 = c1;
        this.c2 =c2;
        this.c3= c3;
        this.avarage = avarage;
        this.isPass= false;

    }
    void bulkSozluNotes(double sozlu1, double sozlu2, double sozlu3){
        if(sozlu1>=0&&sozlu1<=100){
            c1.sozluNote=sozlu1*0.2;
        }
        if(sozlu2>=0&&sozlu2<=100){
            c2.sozluNote=sozlu2*0.2;
        }
        if(sozlu3>=0&&sozlu3<=100){
            c3.sozluNote=sozlu3*0.2;
        }


    }

    void bulkExamNotes(double note1, double note2, double note3){

        if(note1>=0&&note1<=100){
            c1.note=note1*0.8;
        }
        if(note2>=0&&note2<=100){
            c2.note=note2*0.8;
        }
        if(note3>=0&&note3<=100){
            c3.note=note3*0.8;
        }


    }
    void isPass(){
        System.out.println("===================");
        this.avarage = ((this.c1.note+this.c1.sozluNote)+(this.c2.note+this.c2.sozluNote)+(this.c3.note+this.c3.sozluNote))/3.0;
        if(this.avarage>55){
            System.out.println("GECTI...");


        }else{
            System.out.println("KALDI...");
        }
        printNote();
    }


    void printNote(){

        System.out.println(c1.name+ " notu: " + (c1.note+ c1.sozluNote));
        System.out.println(c2.name+ " notu: " + (c2.note+ c2.sozluNote));
        System.out.println(c3.name+ " notu: " + (c3.note+ c3.sozluNote));
        System.out.println("Ortalamaniz"+ this.avarage);
    }

}
