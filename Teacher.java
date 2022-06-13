public class Teacher {
    String name;
    String mpho;
    String branch;

    Teacher(String name,String branch,String mpho) {
        this.branch = branch;
        this.mpho = mpho;
        this.name = name;
    }

    void print(){

        System.out.println("Adi :"+ this.name);
        System.out.println("Telefon :"+ this.mpho);
        System.out.println("Bolumu :"+ this.branch);
    }
}
