package example.lambda.demo4;

/**
 * 函数式接口 (Functional Interface) 就是一个具有一个方法的普通接口。
 * 只有函数式接口才能使用lambda表达式
 * Lambda表达式:是可推导,可以省略
 *     凡是根据上下文推导出来的内容,都可以省略书写
 *     可以省略的内容:
 *         1.(参数列表):括号中参数列表的数据类型,可以省略不写
 *         2.(参数列表):括号中的参数如果只有一个,那么类型和()都可以省略
 *         3.{一些代码}:如果{}中的代码只有一行,无论是否有返回值,都可以省略({},return,分号)
 *             注意:要省略{},return,分号必须一起省略
 */
public class TestSciCalculator {
    public static void main(String[] args){
        System.out.println(new SciCalculator(3,6).invokeCalc(new Calculator(){
            /**
             * 定义一个计算两个int整数和的方法并返回结果
             *
             * @param a
             * @param b
             */
            @Override
            public int calc(int a, int b) {
                return a-b;
            }
        }));

        /**
         * lambda表达式只是代表函数，没有具体的值
         */
        System.out.println(new SciCalculator(3,6).invokeCalc((x,y)->x+y));
    }
}
