package Enumerated;

public enum color {
    RED("red"),GREEN("green"),BLUE("blue")
    ;
    private String color;
    color(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}
