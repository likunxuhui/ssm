package com.likun.app;



import redis.clients.jedis.Jedis;


/**
 * Created by shuyun on 2016/6/30.
 */
public class RedisTest {

    private Jedis jedis;

     public void init() {
           //连接redis服务器，192.168.0.100:6379
         jedis = new Jedis("172.18.52.239", 6379);
         //权限认证
        // jedis.auth("admin");
     }


    public void testString1(){
        Jedis jedis = new Jedis("172.18.52.239", 6379);
        jedis.set("lover","xuhui");
        System.out.println(jedis.get("lover"));
        jedis.append("lover","xuhui");
        System.out.println(jedis.get("lover"));

    }

    public static void main(String [] args){
        Jedis jedis = new Jedis("172.18.52.239", 6379);
        //权限认证
        //jedis.auth("admin");
        jedis.set("lover","xuhui");
        System.out.println(jedis.get("lover"));

    }



}
