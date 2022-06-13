public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "TRH","0005");
        Teacher t2 = new Teacher("Graham Bell","FZK","0004");
        Teacher t3 = new Teacher("Kul Yutmaz","BIO","0001");
        //ti.print();

        Course tarih =new Course("Tarih","101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizk","102","FZK");
        fizik.addTeacher(t2);
        Course bio= new Course("Biyoloji","108","BIO");
        bio.addTeacher(t3);

        tarih.addTeacher(t1);

        Student s1 = new Student("zafer","123","3D",tarih,fizik,bio);
        s1.bulkSozluNotes(100,80,80);
        s1.bulkExamNotes(100,50,50);
        s1.isPass();


        



    }
}
