package cn.edkso.java_basics.jvm.reflect;

import java.io.*;

public class MyClassLoader extends ClassLoader{
    public String path;
    public String classLoaderName;



    public MyClassLoader(String path, String classLoaderName) {
        this.path = path;
        this.classLoaderName = classLoaderName;

        System.out.println(path);
    }



    //用于寻找类文件
    @Override
    public Class findClass(String name){
        byte[] b = loadClassDate(name);
        return defineClass(name,b,0,b.length);
    }

    /**
     * 用于加载类文件
     * @param name
     * @return
     */
    private byte[] loadClassDate(String name) {
        name = path + name + ".class";
        FileInputStream in = null;
        ByteArrayOutputStream out = null;
        try {
            in = new FileInputStream(new File(name));
            out = new ByteArrayOutputStream();
            int i = 0;
            while ((i = in.read())!= -1){
                out.write(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {

            try {
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return out.toByteArray();
    }
}
