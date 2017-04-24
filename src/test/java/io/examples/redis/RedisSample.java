package io.examples.redis;

import redis.clients.jedis.Jedis;

public class RedisSample {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.set("login:1", "user1");

        String user1 = jedis.get("login:1");

        System.out.printf("data:" + user1);
    }
}
