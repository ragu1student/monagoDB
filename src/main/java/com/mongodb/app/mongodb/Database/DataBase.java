package com.mongodb.app.mongodb.Database;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "ListOfSubjects")
public class DataBase {
    @Id
    
    private String rollNo;
    private String name;


    public DataBase() {
    }
    public DataBase(String rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }


    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    

    
}
