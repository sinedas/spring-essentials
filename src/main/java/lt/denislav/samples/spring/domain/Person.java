package lt.denislav.samples.spring.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {

    private Long id;

    @NotEmpty
    private String name;

    @Size(min = 11, max = 11)
    private String code;

    private String gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
