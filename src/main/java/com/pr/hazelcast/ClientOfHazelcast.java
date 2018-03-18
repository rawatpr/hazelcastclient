package com.pr.hazelcast;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

public class ClientOfHazelcast {
    public static void main(String[] args) {
//        ClientConfig clientConfig = new ClientConfig();
        HazelcastInstance hazelcastInstance = HazelcastClient.newHazelcastClient();
        IMap map = hazelcastInstance.getMap("customers");
        System.out.println(map.get("01"));
        System.out.println(map.get("02"));
        System.out.println(map.get("03"));
    }
}
