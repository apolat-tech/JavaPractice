package com.syntax.class26;

public abstract class File {
    abstract void open();

    void edit() {
        System.out.println("Edit");
    }

    void close() {
        System.out.println("Close");
    }

    public static void main(String[] args) {
        File[] files = new File[3];

        files[0] = new JavaFile();
        files[1] = new WordFile();
        files[2] = new PdfFile();


        for (File file : files) {
            file.open();
            file.edit();
            file.close();
        }
    }
}

class JavaFile extends File {

    @Override
    void open() {
        System.out.println("We need notepad++ or sublime text");
    }
}

class WordFile extends File {

    @Override
    void open() {
        System.out.println("We need MS Office to open Word");
    }
}

class PdfFile extends File {

    @Override
    void open() {
        System.out.println("We need Adobe Reader for pdf files");
    }
}

