package org.example;

import org.example.controller.Controller;
import org.example.model.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new ComplexNumber(2, 4),
                new ComplexNumber(4, 2));
        controller.start();
    }
}