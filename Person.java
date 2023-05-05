public class Person {
    private int age;
    private String name;
    private String surname;

    private boolean partner;

    private String sex;

    public Person(int age, String name, String surname, boolean partner, String sex) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.partner = partner;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean getPartner() {
        return partner;
    }

    public void setPartner(boolean partner) {
        this.partner = partner;
    }

    public void isRetired(){
        if(getAge()>=65 && getSex() =="man") {
            System.out.println("is retired");
        }else{
                System.out.println("isn't retired");
            }
        }


        public void registeredPartnership (Person woman, String womanSurname) {
      woman.setSurname(womanSurname);
   }

    }








