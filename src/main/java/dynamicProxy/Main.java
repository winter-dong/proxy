package dynamicProxy;

import staticProxy.IService;
import staticProxy.ServiceImpl;

public class Main {
    public static void main(String[] args){
        ServiceProxy proxy = new ServiceProxy();
        IService service = (IService) proxy.bind(new ServiceImpl());
        service.doSth();
    }
}
