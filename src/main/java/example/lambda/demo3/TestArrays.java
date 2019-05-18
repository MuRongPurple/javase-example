package example.lambda.demo3;

import java.util.Arrays;
import java.util.Comparator;

public class TestArrays {
    public static void main(String[] args){
        Person[] arr = {
                new Person("古力娜扎",18),
                new Person("迪丽热巴",19),
                new Person("安居拉粑粑",29),
                new Person("柳岩",39)
        };

        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for (Person person : arr) {
            System.out.println(person);
        }

        Arrays.sort(arr,(o1,o2)->{
            return o2.getAge() - o1.getAge();
        });

        /**
         * Lambda表达式:是可推导,可以省略
         *     凡是根据上下文推导出来的内容,都可以省略书写
         *     可以省略的内容:
         *         1.(参数列表):括号中参数列表的数据类型,可以省略不写
         *         2.(参数列表):括号中的参数如果只有一个,那么类型和()都可以省略
         *         3.{一些代码}:如果{}中的代码只有一行,无论是否有返回值,都可以省略({},return,分号)
         *             注意:要省略{},return,分号必须一起省略
         */
        Arrays.sort(arr,(o1,o2)-> o2.getAge() - o1.getAge());

        for (Person person : arr) {
            System.out.println(person);
        }

    }
}
