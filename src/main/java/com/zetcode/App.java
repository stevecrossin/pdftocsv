package com.zetcode;

import java.io.IOException;


import static com.zetcode.pdfReader.testParser;

public class App {

    public static void main(String[] args) throws IOException {

        testParser("src/main/resources/959159.pdf");
        testParser("src/main/resources/bike_repair.pdf");
        testParser("src/main/resources/new_comp.pdf");
        testParser("src/main/resources/qantas_ff.pdf");

    }
}