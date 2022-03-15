package com.company.ioc_DI.ch01_stream;

import java.io.*;

public class OutputStream1 {
    public static void main(String[] args) {
        try(OutputStream out = new FileOutputStream("test.txt")) {
            out.write(65);
            InputStream in = new FileInputStream("test.txt");
            int num = in.read();
            System.out.println(num);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
