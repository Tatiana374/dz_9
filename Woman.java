public class Woman extends Person {

    public Woman(int age, String name, String surname, boolean partner, String sex) {
        super(age, name, surname, partner, sex);
    }

    public void isRetired() {
        if (getAge(woman) >= 60) {
            System.out.println(getname(woman) + "is retired");
        } else {
            System.out.println(getname(woman) + "isn't retired");
        }
    }

    public void registeredPartnership(Man man ) {
      this.surname= man.surname;
      this.setPartnet(true);
        }

        public void printNewSurname () {
            if (getPartner()) {
                System.out.println(this.getSurname());
            } else {
                System.out.println(this.getName() + "is free");


    }
 /* deregisterPartnership (як вхідний параметр приймає boolean: повернення до попереднього прізвища)
 я не розумію як це зробити взагалі
 */


 public void deregisteredPartnership() {
        if (getPartner()) {
        System.out.println(woman.getSurname());



}
