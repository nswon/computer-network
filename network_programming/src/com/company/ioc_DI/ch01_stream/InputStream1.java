package com.company.ioc_DI.ch01_stream;

import java.io.IOException;

public class InputStream1 {

    public static void main(String[] args) {
        byte[] input = new byte[10];
        int b=0;

        for(int i=0; i<input.length; i++) {
            try {
                b = System.in.read();
                System.in.read();
            } catch (IOException e) {
                System.out.println("IOException");
            }
            input[i] = (byte) b; // int 를 byte 에다가 넣으려고 하니까 오류가 뜸 -> 형변환을 해줌
        }

        System.out.println(input);
        for(byte c : input) {
            System.out.println(c + " ");
        }

    }
}
