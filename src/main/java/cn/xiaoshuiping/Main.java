package cn.xiaoshuiping;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString();
        System.out.println("uuid = " + uuid);
    }
}
