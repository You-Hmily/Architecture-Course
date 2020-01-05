package org.hmily.rpc.protocol;

import java.io.Serializable;

public class InvokerProtocol implements Serializable {

    private String className;

    private String methodName;

    private Class<?>[] paramters;// 形参列表

    private Object[] values;// 实参列表

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Class<?>[] getParamters() {
        return paramters;
    }

    public void setParamters(Class<?>[] paramters) {
        this.paramters = paramters;
    }

    public Object[] getValues() {
        return values;
    }

    public void setValues(Object[] values) {
        this.values = values;
    }
}
