package com.sthmishra.oops.abstraction.udemy;

public class Test {
    public static void main(String[] args) {
        TouchScreenLaptop hpNotebook = new HPNoteBook();
        hpNotebook.click();
        hpNotebook.scroll();

        TouchScreenLaptop dellNotebook = new DellNoteBook();
        dellNotebook.click();
        dellNotebook.scroll();
    }
}
