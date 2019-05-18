package example.lambda.demo2;

public class Test {
    public static void main(String[] args){
        /**
         * 匿名内部类
         */
        new Cooker().startWork(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("做菜1");
            }
        });

        /**
         * lambda表达式
         */
        new Cooker().startWork(()-> System.out.println("做菜2"));
    }
}
