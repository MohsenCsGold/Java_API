package com.tsetmc.API_NO_DB.Repository;

import com.tsetmc.API_NO_DB.Model.Person;

import java.util.ArrayList;

public class DataClass {
    public ArrayList<Person> GenerateData() {
        ArrayList<Person> lst = new ArrayList<>();
        lst.add(new Person(1 , "Mohsen"));
        lst.add(new Person(2 , "Ali"));
        return lst;
    }
}
