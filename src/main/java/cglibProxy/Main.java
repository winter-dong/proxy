package cglibProxy;

import staticProxy.IService;
import staticProxy.ServiceImpl;

public class Main {
    public static void main(String[] args){
        CglibProxy proxy = new CglibProxy();
        ServiceImpl service = (ServiceImpl) proxy.getInstance(new ServiceImpl());
        service.doSth();
        service.doFinal();
    }
}
