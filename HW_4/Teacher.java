
public class Teacher {
    private String name;
    private int age;
    private String subject;

    public Teacher (String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
    public Integer getAge() {
        return age; 
    }

    public void setSecondName(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
               "name='" + name + '\'' +
               ", age='" + age + '\'' +
               ", subject='" + subject + 
               '}';
    }

}
