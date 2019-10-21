package com.example.whoareyou;

public class Player {
    private String name;
    private int age;

    public void setName(String name) {
        if (this.name == null) {
            this.name = name;
        } else System.out.println("У меня есть имя! Меня зовут: " + this.name);
    }

    public void setAge(int age) {
        if (this.age == null) {
            this.age = age;
        } else System.out.println("Мне уже исполнилось: " + this.age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
