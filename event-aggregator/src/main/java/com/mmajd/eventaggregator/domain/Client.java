package com.mmajd.eventaggregator.domain;

public class Client {
    private String name;
    private String address;

    private Client(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static Client of(String name, String address) {
        return new Client(name, address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
