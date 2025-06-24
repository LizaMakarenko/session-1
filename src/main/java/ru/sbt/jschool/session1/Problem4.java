package ru.sbt.jschool.session1;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Problem4 {
    public static void main(String[] args) {
       int result = resultCountFromParams(args);
       if(result==-1){
           System.out.println("Не указано значение JSCHOOl1_COUNT\n" +
                   "Вы можете задать его:\n" +
                   " - как параметр: JSCHOOl1_COUNT=XXX\n" +
                   " - как системную настройку: -DJSCHOOl1_COUNT=XXX\n" +
                   " - как переменную окружения: JSCHOOl1_COUNT=XXX\n" +
                   " - в файле, путь к которому задан через переменную окружения JSCHOOL1_PROPERTIES_FILE.");
           return;
       }
       for(int i=0;i<result;i++){
           System.out.println("Hello Word");
       }
    }
    public static int resultCountFromParams(String[] args) {
        String contValue =null;
        for(String arg:args){
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
            String propsPath=System.getProperty("JSCHOOL1_PROPERTIES_FILE");
            if(propsPath!=null){
                File propsFile =  new File(propsPath);
                if(propsFile.exists()){
                    Properties props = new Properties();
                    try(FileInputStream fis = new FileInputStream(propsFile)){
                        props.load(fis);
                        contValue=props.getProperty("JSCHOOl1_COUNT");
                    }
                    catch (Exception e){
                        System.out.println("Ошибка при чтении файла");
                        return -1;
                    }
                }
            }
        }
        if(contValue!=null){
            try{
                return Integer.parseInt(contValue);
            }
            catch(NumberFormatException e){
                System.out.println("Неверное значение JSCHOOl1_COUNT"+ contValue);
                return -1;
        }
        }
        return -1;
    }
}
