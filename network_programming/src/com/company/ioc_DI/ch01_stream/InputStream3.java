package com.company.ioc_DI.ch01_stream;

import java.io.IOException;

/*
    1024만큼 입력을 받아서
    enter 치면
    만약 1000개 입력하면 나머지 24는 이상한거로 채워짐.
    무조건 1024가 채워짐.
*/

public class InputStream3 {
    public static void main(String[] args) {
        int byteRead = 0;
        int byteToRead = 16;
        byte[] input = new byte[byteToRead];

        while(byteRead < byteToRead) {
            try {
                int result = System.in.read(input, byteRead, byteToRead-byteRead);
                if(result == -1)
                    break;
                byteRead += result;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for(int i=0; i<input.length; i++) {
            System.out.print((char)input[i] + " ");
        }
    }
}
