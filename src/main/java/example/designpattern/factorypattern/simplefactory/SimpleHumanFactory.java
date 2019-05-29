package example.designpattern.factorypattern.simplefactory;

/**
 * 简单造人工厂
 */
public class SimpleHumanFactory {
    public static <T extends Human> T create(Class<T> c){
        Human human = null;
        try {
            human = (Human)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)human;
    }
}
