package com.neuedu.inner.four;

public class OuterClass {
    private void interPrint(boolean b){
        if(b){
            class Inner{
                private String str;
                private Inner(String str){
                    this.str=str;
                }
                public String getStr(){
                    return str;
                }
            }

            Inner inner=new Inner("202");
            System.out.println(inner.getStr());

        }else{
            System.out.println("无效位置");
        }
    }

    public void  publicPrint(boolean b){
        interPrint(b);
    }

}
