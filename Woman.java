public class Woman extends Person {

    public Woman(int age, String name, String surname, boolean partner, String sex) {
        super(age, name, surname, partner, sex);
    }
    private String maidenName
    public void isRetired() {
        if (getAge(woman) >= 60) {
            System.out.println(getname(woman) + "is retired");
        } else {
            System.out.println(getname(woman) + "isn't retired");
        }
    }

    Override
    public void registerPartnership(Person person) {
        if (partner == null) {
            partner = person;
            person.setPartner(this);
            this.lastName = person.getLastName();
    }
    @Override
    public void deregisterPartnership ( boolean returnToPreviousLastName){
        if (partner != null) {
            partner.setPartner(null);
            partner = null;
            if (returnToPreviousLastName) {
                setLastName(maidenName);
            }
        }
    }



}
