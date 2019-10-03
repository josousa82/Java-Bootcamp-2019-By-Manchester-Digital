package com.manchesterdigital.objects.solidprinciples.singleresponsabilityexmaple;

public class Book {
    private String name;
    private String author;
    private String isbn;
    private Printer printer;

    // Constructors, getters, setters...

    public boolean isInIsbn(String sequence){
        return isbn.contains(sequence);
    }

    public void printToConsole(){
        printer.printToConsole("Hello");
    }
}
