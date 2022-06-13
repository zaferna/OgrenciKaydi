public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double sozluNote;

    Course(String name, String code,String prefix){

        this.name= name;
        this.code= code;
        this.prefix= prefix;
        this.teacher= teacher;
         int note = 0;
         int sozluNote = 0;


    }

    void addTeacher(Teacher teacher){

        if (teacher.branch.equals(this.prefix)){
            this.teacher =  teacher;


        }else{
            System.out.print("Ogretmen Atanamadi");
        }





    }

    void printTeacherInfo(){

        this.teacher.print();
    }

}
