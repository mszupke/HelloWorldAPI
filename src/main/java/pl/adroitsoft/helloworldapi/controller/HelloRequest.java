package pl.adroitsoft.helloworldapi.controller;

public class HelloRequest {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
