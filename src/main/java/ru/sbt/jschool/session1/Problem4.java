package ru.sbt.jschool.session1;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Problem4 {
public static void main(String[] args) {
    String contValue = null;
    for (String arg : args) {
        if(arg.startsWith("JSCHOOl1_COUNT=")){
            contValue=arg.substring("JSCHOOl1_COUNT=".length());
            break;
        }
    }
    if(contValue==null){
        contValue=System.getProperty("JSCHOOl1_COUNT");
    }
    if(contValue==null){
        contValue=System.getenv("JSCHOOl1_COUNT");
    }
    if(contValue==null){
        String propsPath= System.getProperty("JSCHOOL1_PROPERTIES_FILE");
        if(propsPath!=null){
            File propsFile = new File(propsPath);
            if (propsFile.exists() ){
                Properties props = new Properties();
                try (FileInputStream fis = new FileInputStream(propsFile)) {
                    props.load(fis);
                    contValue=props.getProperty("JSCHOOl1_COUNT");
                }
                catch (Exception e) {
                    System.out.println("Ошибка при чтании файла");
                    return;
                }

            }
        }
    }
    if(contValue!=null){
        try{
            int count=Integer.parseInt(contValue);
            for(int i=0;i<count;i++){
                System.out.println("Hello World");
            }
        }
        catch(Exception e){
            System.out.println("Неверное значение для JSCHOOl1_COUNT");
        }
    }
    else {
        System.out.println("Не указано значение JSCHOOl1_COUNT" +
                "Вы можете задать его:" +
                "как параметр: JSCHOOl1_COUNT=;" +
                "как системную настройку: JSCHOOl1_COUNT=;" +
                "как переменную окружения: export JSCHOOl1_COUNT=;" +
                "в файле, путь к которому задан через переменную окружения JSCHOOL1_PROPERTIES_FILE.");
    }
}
}
