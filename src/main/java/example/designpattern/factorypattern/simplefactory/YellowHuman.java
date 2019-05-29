package example.designpattern.factorypattern.simplefactory;

public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("yellow");
    }

    @Override
    public void talking() {
        System.out.println("你好");
    }
}
