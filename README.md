## 设计模式(23种)
    创建型模式(5):--->用于解决对象创建过程
     1.单例模式  2.工厂方法模式  3.抽象工厂模式  4.建造者模式  5.原型模式
     
     构建型模式(7):--->把类或对象通过某种形式结合在一起 构成某种复杂或合理的结构
     1.适配器模式  2.装饰者模式  3.代理模式  4.外观模式   5.桥接模式  6.组合模式  7.享元模式
     
     行为型模式(11)：--->用来解决类或对象之间的交互 更合理的优化类或对象之间的关系
     1.观察者模式 2.策略模式 3.模板模式  4.责任链模式 5.解析器模式 6.迭代子模式 
      7.命令模式  8.状态模式  9.备忘录模式 10.访问者模式  11.中介者模式
  
### 单例模式
    单例模式（Singleton）的目的是为了保证在一个进程中，某个类有且仅有一个实例。
    单例模式的设计：
    1.只有private构造方法，确保外部无法实例化；
    2.通过private static变量持有唯一实例，保证全局唯一性；
    3.通过public static方法返回此唯一实例，使外部调用方能获取到实例。
__一般情况下是通过约定让框架来实例化这些类，保证只有一个实例，调用方自觉通过框架获取实例而不是new操作符：
    所以Singleton模式一般以“约定”为主__

###工厂方法
__工厂方法的目的是使得创建对象和使用对象是分离的，并且客户端总是引用抽象工厂和抽象产品：__

###适配器
__将一个类的接口转换成我们希望的目标，使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。

    编写一个Adapter的步骤如下：
    实现目标接口，这里是Runnable；
    内部持有一个待转换接口的引用，可以通过字段持有；
    在目标接口的实现方法内部，调用待转换接口的方法，以此实现间接调用。
    
