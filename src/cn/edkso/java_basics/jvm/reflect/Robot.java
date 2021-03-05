package cn.edkso.java_basics.jvm.reflect;

public class Robot {

    private String name;

    public void say(String saySentence){
        System.out.println(name + ": " +saySentence);
    }

    private String eat(String food){
        return "吃： " + food;
    }


}
