package main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {
    private String name= "koko";

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public String toString(){
//        return "Parrot : " + name;
//    }
}