package staticProxy;

public class ServiceProxy implements staticProxy.IService {
    private staticProxy.ServiceImpl serviceImpl;

    public ServiceProxy(staticProxy.ServiceImpl serviceImpl) {
        this.serviceImpl = serviceImpl;
    }

    public void doSth() {
        System.out.println("before doSth");
        this.serviceImpl.doSth();
        System.out.println("after doSth");
    }
}
