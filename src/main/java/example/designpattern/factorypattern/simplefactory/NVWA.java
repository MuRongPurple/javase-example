package example.designpattern.factorypattern.simplefactory;

public class NVWA {
    public static void main(String[] args) {
        YellowHuman yellowHuman = SimpleHumanFactory.create(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talking();
    }
}
