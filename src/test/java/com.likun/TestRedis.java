package com.likun;
import com.likun.config.CacheConfig;
import redis.clients.jedis.Jedis;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * Created by shuyun on 2016/7/1.
 */
public class TestRedis {
    private Jedis jedis;
//    @Before
//    public void init() {
//        //连接redis服务器，192.168.0.100:6379
//        jedis = new Jedis(CacheConfig.getHost(),CacheConfig.getPort());
//        //权限认证
//        // jedis.auth("admin");
//    }
//
//    @Test
//    public void testString(){
//        jedis.set("name","xuhui");
//        System.out.println(jedis.get("name"));
//        jedis.append("name","xuhui");
//        System.out.println(jedis.get("name"));
//        jedis.del("name");  //删除某个键
//         System.out.println(jedis.get("name"));
//        jedis.mset("name","xuhui","age","23","birthday","1991年");
//        System.out.println(jedis.mget("name","age"));




//    }


}
