Java代理的三种方式：
1 静态代理
2 proxy动态代理
3 cglib动态代理

方式1 和具体的类耦合，每次都要手动编码具体类的代理类
方式2 基于接口，需要有接口声明
方式3 基于继承，不需要接口声明，但是final方法无法被继承，所以无法拦截
