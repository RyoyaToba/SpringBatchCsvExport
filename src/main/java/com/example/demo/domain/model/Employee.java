package com.example.demo.domain.model;

import com.example.demo.config.SampleProperty;
import lombok.Data;
import org.springframework.data.relational.core.sql.In;

@Data
public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private Integer gender;
    private String genderString;

    public void convertGenderIntToString(){
        if(gender == 1){
            genderString = "男性";
        } else if (gender == 2) {
            genderString = "女性";
        } else {
            String errorMsg = "Gender is invalid:" + gender;
            throw new IllegalStateException(errorMsg);
        }
    }
}
