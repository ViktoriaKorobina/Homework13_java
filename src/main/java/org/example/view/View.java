package org.example.view;

import org.example.model.ComplexNumber;

public class View {
    public void printComplexNumber(ComplexNumber complexNumber){
        if (complexNumber.getImaginary() < 0){
            System.out.println(complexNumber.getValid() + " " + complexNumber.getImaginary() + " * i");
        } else {
            System.out.println(complexNumber.getValid() + " + " + complexNumber.getImaginary() + " * i");
        }

    }
}
