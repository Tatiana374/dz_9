public class Woman extends Person {

    public Woman(int age, String name, String surname, boolean partner, String sex) {
        super(age, name, surname, partner, sex);
    }

    public void isRetired() {
        if (getAge() >= 60) {
            System.out.println(name + "is retired");
        } else {
            System.out.println(name + "isn't retired");
        }
    }

    public void registeredPartnership() {
        if (getPartner() == true) {
            System.out.println(name + man.getSurname);
        } else {
            System.out.println(name + "is free");
        }
/*  мені здається це якось тупо я написала, але не можу придумати далі, типу ідея завдання у тому,
шоб я за допомогою якогось методу присвоїла прізвише of man ( from Class Man) але я не розумію як
 */

    }
 /* deregisterPartnership (як вхідний параметр приймає boolean: повернення до попереднього прізвища)
 я не розумію як це зробити взагалі
 public void deregisteredPartnership() {
        if (getPartner() == false) {
        System.out.println(name + woman.getSurname);
  */
}
