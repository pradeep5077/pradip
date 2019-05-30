public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName= " + person.getFullName());
    }

    private String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private int getAge() {

        return age;
    }

    private void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            this.age = 0;
        }


    }

    private String getFullName() {
        if (getFirstName().isEmpty() && getLastName().isEmpty()) {
            return firstName + " " + lastName;
        } else {
            return firstName + " " + lastName;
        }
    }


    private boolean isTeen() {
        if (getAge() > 12 && getAge() < 20) {
            return true;
        }
        return false;


    }
}
