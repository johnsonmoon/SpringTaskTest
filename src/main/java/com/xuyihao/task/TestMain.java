package com.xuyihao.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Xuyh at 2016/08/04 下午 08:10.
 */
public class TestMain {
    public static void main(String args[]){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:app-context-*.xml");
        //test1();
        //test2();
        test3();
    }

    public static void test3(){
        Date now = DateUtils.parseDate(DateUtils.currentDate());
        String thisMonth = getMonth(DateUtils.parseDate(DateUtils.currentDate()));
        String thisDay = getDay(DateUtils.parseDate(DateUtils.currentDate()));
        System.out.println(thisMonth);
        System.out.println(thisDay);
    }

    public static void test2(){
        List<String> a = new ArrayList<String>();
        a.add("KKK");
        String out = "";
        a = removeSame2(a);
        String out2 = "";
        for (String e : a){
            out2 += (" || " + e);
        }
        System.out.println(out2);
    }

    public static void test1(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("hello", "yeah");
        map.put("helloMap", "yeah!oh!");

        Map<String , String> temp = new HashMap<String, String>();
        temp.putAll(map);
        map.clear();

        System.out.println(map.size());

        System.out.println(temp.size());


        for(String key : map.keySet()){

            System.out.println(key + " || " + map.get(key));
        }

        for (String key2 : temp.keySet()){
            System.out.println(key2 + " || " + temp.get(key2));
        }
    }

    private static void removeSame(List list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
    }


    private static List removeSame2(List list){
        List listNew = new ArrayList();
        for(int i = 0; i < list.size(); i++){
            boolean has = false;
            for(int j = 0; j < listNew.size(); j++){
                if(list.get(i).equals(listNew.get(j))){
                    has = true;
                    break;
                }
            }
            if(!has){
                listNew.add(list.get(i));
            }
        }
        return listNew;
    }

    private static String getDay(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
        String day = simpleDateFormat.format(date);
        return day;
    }

    private static String getMonth(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM");
        String month = simpleDateFormat.format(date);
        return month;
    }
}