package cn.edkso.java_basics.jvm.reflect;

public class ClassLoaderChecker {

    public static void main(String[] args) throws ClassNotFoundException {
        MyClassLoader m = new MyClassLoader(
                "/Users/dingmengdi/Desktop/",
                ""
        );
        System.out.println(m.path);
        Class robot = m.loadClass("Wali");

        try {
            robot.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
