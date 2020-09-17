package ru.learning.basepatterns.structural.adapter.throughinheritance;

import ru.learning.basepatterns.structural.adapter.throughinheritance.adapter.VectorAdapterFromRaster;
import ru.learning.basepatterns.structural.adapter.throughinheritance.target.VectorGraphicInterface;

class AdapterApp {
    public static void main(String[] args) {
        VectorGraphicInterface graphicInterface = new VectorAdapterFromRaster();
        graphicInterface.drawLine();
        graphicInterface.drawSquare();
    }
}
