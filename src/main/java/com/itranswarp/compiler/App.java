package com.itranswarp.compiler;

import java.io.IOException;
import java.util.Map;

public class App {

    static final String SINGLE_JAVA = "package tech.yiren.ystart.lowcode.entity;        \n" +
            "import lombok.Data;import java.time.LocalDateTime;                  \n" +
            "import org.springframework.data.annotation.Id;   \n" +
            "import java.util.ArrayList;                      \n" +
            "import java.util.HashMap;                      \n" +
            "@Data                                            \n" +
            "public class ruzhi {\n" +
            "\t@Id                                             \n" +
            "\tpublic String id;                               \n" +
            "\tpublic String name;                              \n" +
            "\tpublic LocalDateTime ruzhishijian;                               \n" +
            "\tpublic Integer yihun;                               \n" +
            "\tpublic String intro;                               \n" +
            "\tpublic Long age;                               \n" +
            "\tpublic Double weight;                               \n" +
            "\tpublic Double gongzi;                               \n" +
            "\tpublic Double jindu;                               \n" +
            "}";

    public static void main(String args[]) throws IOException {
        JavaStringCompiler compiler = new JavaStringCompiler();
        Map<String, byte[]> results = compiler.compile("ruzhi.java", SINGLE_JAVA);
        System.out.println(results);
    }
}
