package com.neuedu.api.object0730.one;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    /**
     * HashMap的特点：
     * 1）key，value 允许为null
     * 2）当key值重复时，保存的最后输入的值
     * 3）不同步，适合单线程
     * @param args
     */
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
         hashMap.put("002","li");
         hashMap.put("003","zhang");
         hashMap.put(null,null);
         hashMap.put("003","chen");
        System.out.println(hashMap);
        System.out.println("============================");
        Set<String> keys=hashMap.keySet(); /*得到keys*/
        for(String key:keys){
            System.out.println(key+"  "+hashMap.get(key)); //通过对象调用方法get，传入key中调出value值
        }
        System.out.println("===============================");
        Set<Map.Entry<String,String>>  entrys=hashMap.entrySet();
         for(Map.Entry<String,String> e:entrys){
             System.out.println(e.getKey()+"   "+e.getValue());
         }

    }
}
