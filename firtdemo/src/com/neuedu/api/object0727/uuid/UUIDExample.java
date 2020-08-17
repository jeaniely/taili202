package com.neuedu.api.object0727.uuid;

import java.util.Date;
import java.util.UUID;

public class UUIDExample {
    public static void main(String[] args) {
        //自定义id
        String strid=new Date().getTime()+"";
        System.out.println(strid);
        //uuid
       String uuid= UUID.randomUUID().toString();
       String uuids=uuid.replace("-","");
        System.out.println(uuids);



    }
}
