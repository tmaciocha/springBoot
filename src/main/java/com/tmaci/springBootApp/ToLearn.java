package com.tmaci.springBootApp;

public class ToLearn {
    private int id;
    private String name;
    private String resource;

    public ToLearn(int id, String name, String resource) {
        this.id = id;
        this.name = name;
        this.resource = resource;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getResource() {
        return resource;
    }

    @Override
    public String toString() {
        return "ToLearn{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", resource='" + resource + '\'' +
                '}';
    }
}
