public class Person {
    private String surname;
    private String name;
    private String secondName;

    public Person(String surname, String name, String secondName) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object p){
        if(this.getName().equals(((Person)p).getName()) &&
        this.getSecondName().equals(((Person)p).getSecondName()) &&
        this.getSurname().equals(((Person)p).getSurname())){
            return false;
        }
        return true;
    }
}
