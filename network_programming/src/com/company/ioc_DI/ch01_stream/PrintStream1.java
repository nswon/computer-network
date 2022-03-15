package com.company.ioc_DI.ch01_stream;

import java.io.IOException;
import java.io.OutputStream;

public class PrintStream1 {
    public static void generateCharacters(OutputStream out) throws IOException {
        int firstPrintableCharacter = 33;
        int numberOfPrintableCharacters = 94;
        int numberOfCharactersPerLine = 72;

        int start = firstPrintableCharacter;
        while(true) {
            for(int i=start; i<start + numberOfCharactersPerLine; i++) {
                out.write((i-firstPrintableCharacter)%numberOfPrintableCharacters + firstPrintableCharacter);
            }
            out.write('\n');
            start = ((start + 1) - firstPrintableCharacter) % numberOfPrintableCharacters + firstPrintableCharacter;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        try {
            generateCharacters(System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
