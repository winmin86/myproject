package xyz.up123.factoryMethod;

/**
 * @Author：ZhuWenming
 * @CreateTime：2019/11/4 11:06
 * @Description：TODO
 * @Version: V1.0.0
 */
//具体产品1：实现抽象产品中的抽象方法
class ConcreteProduct1 implements Product {
    public void show() {
        System.out.println("具体产品1显示...");
    }
}
