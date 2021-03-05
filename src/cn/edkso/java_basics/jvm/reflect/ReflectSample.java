package cn.edkso.java_basics.jvm.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectSample {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class<?> robotClass = Class.forName("cn.edkso.java_basics.jvm.reflect.Robot");
        Robot robot = (Robot) robotClass.newInstance();

        robot.say("我是中国人");

        String robotClassName = robotClass.getName();
        System.out.println(robotClassName);

        Method sayMethod = robotClass.getDeclaredMethod("say", String.class);
        sayMethod.setAccessible(true);
        sayMethod.invoke(robot,"我是中国人");

        Method[] methods = robotClass.getMethods();
    }
}
