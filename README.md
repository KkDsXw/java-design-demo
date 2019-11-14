# 设计模式
## 策略模式
一个类A持有一个接口对象B，接口对象B为A的构造函数的入参。B则为策略接口，B中有多个需要实现的方法，由实现类B1，B2，B3实现，构造A对象是传入B对象的实现类，调用不同的接口方法实现从而实现策略模式
## 静态代理模式
1.具有相同的接口<br>
2.代理类持有被代理类的对象<br>
3.执行时调用被代理类方法<br>
## 单例模式
单例模式<br>
1.仅有一个对象<br>
2.需要考虑线程安全<br>
3.推荐 恶汉+线程安全<br>
## 多例模式
每一次获取的bean不近相同<br>
如连接池技术
## 工厂方法模式
简单说，<br>
1个接口<br>
多个实现<br>
一个对应的工厂类，并提供一个获取对象的方法<br>
## 抽象工工厂模式
抽象工厂模式---这个模式看着有点绕，特详细注解<br>
1、base包<br>
Human接口定义人的基础接口，抽象类实现黑，白，黄，3个人种共有的方法，其中性别具体实现不同，其他方法实现相同<br>
2、pojo包<br>
为具体的类，实现差异性的方法 sex<br>
3、constant包<br>
存放枚举，无特殊<br>
4、factory包，核心，也是难点<br>
HumanFactory顶层接口创建黑白黄三个人种，不关心内部差异性的接口实现<br>
AbstractHumanFactory 【核心类】 提供一个公共创建对象的方法给子类使用，不实现HumanFactory接口<br>
具体工厂为男性工厂和女性工厂ManHumanFactory和WomanHumanFactory实现HumanFactory接口，调用AbstractHumanFactory方法创建对象<br>

特点：<br>
功能上，高内聚低耦合，易扩展，满足开闭原则 OPC<br>
## 门面模式
门面模式
   比较好理解，就是把几个需要顺序执行的方法封装到一个门面类中，提供入参，仅此而已
## 适配器模式
适配器模式：<br>
    将非我系统的对象转化为适合我系统的对象
## 模板方法模式
模板方法模式就是在模板方法中按照一个的规则和顺序调用基本方法，它提供了一个抽象类，abstract protected方法,由子类实现，按照抽象父类中的方法进行顺序调度
## 建造者模式

## 桥梁模式

## 命令模式

## 装饰器模式

## 迭代器模式

## 组合模式

## 观察者模式
观察者模式，实际为一个消息的广播。被观察者的一个动作将被广播到他的观察者们，逐一通知被观察者做了哪些事情。
## 责任链模式
一个请求，和一批的处理器，这个请求不知道哪个处理器可以处理它，每个处理器仅能处理特定的请求，能处理的则处理，不能处理的则发给下一个处理器进行处理。
## 访问者模式

## 状态模式
# java-design-demo