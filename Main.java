public class Main {
    public static void main(String[] args) {

        Man man = new Man (45,"Alex","Green", true,"man");
        Person woman= new Woman (34,"Olga","White",false, "woman");
        man.isRetired();
        woman.isRetired();
        woman.registeredPartnership(woman,"Green");



    }
}