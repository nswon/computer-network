package com.company.ioc_DI.ch01_stream;

import java.io.IOException;

/*
    1024만큼 입력을 받아서
    enter 치면
    만약 1000개 입력하면 나머지 24는 이상한거로 채워짐.
    무조건 1024가 채워짐.
*/

public class InputStream2 {
    public static void main(String[] args) {
        byte[] input = new byte[1024];

        try {
            int byteRead = System.in.read(input);
        } catch (IOException e) {
            System.out.println("IOException");
        }

        for(int i=0; i<input.length; i++) {
            System.out.print((char)input[i] + " ");
        }
    }
}
