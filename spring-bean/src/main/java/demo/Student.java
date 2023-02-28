package demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String firstName ="Richard";
    private String lastName="MK";
    private  String code="RC";
    public  Student(){}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCode() {
        return code;
    }
}
