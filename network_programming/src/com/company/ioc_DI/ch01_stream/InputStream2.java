package com.company.ioc_DI.ch01_stream;

import java.io.IOException;

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
