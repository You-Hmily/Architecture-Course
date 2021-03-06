package org.hmily.tomcat;

public abstract class MyServlet {


    public void service(MyRequest request,MyResponse response){
        if ("GET".equalsIgnoreCase(request.getMethod())){
            doGet(request,response);
        }else {
            doPost(request,response);
        }
    }

    public abstract void doGet(MyRequest request, MyResponse response);

    public abstract void doPost(MyRequest request, MyResponse response);

}
