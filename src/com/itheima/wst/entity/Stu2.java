package com.itheima.wst.entity;

import java.util.Objects;

public class Stu2 {
    private String name;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stu2{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Stu2(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stu2 stu2 = (Stu2) o;
        return id == stu2.id && Objects.equals(name, stu2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
