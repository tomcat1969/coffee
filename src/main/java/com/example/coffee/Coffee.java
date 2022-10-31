package com.example.coffee;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity

public class Coffee {
    @Id
    private String id;
    public Coffee(){

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coffee(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Coffee(String name) {
        this(UUID.randomUUID().toString(),name);
    }


}
