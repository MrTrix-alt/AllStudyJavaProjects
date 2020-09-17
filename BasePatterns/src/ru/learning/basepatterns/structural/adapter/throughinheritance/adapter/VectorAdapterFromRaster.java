package ru.learning.basepatterns.structural.adapter.throughinheritance.adapter;

import ru.learning.basepatterns.structural.adapter.throughinheritance.adaptee.RasterGraphic;
import ru.learning.basepatterns.structural.adapter.throughinheritance.target.VectorGraphicInterface;

public class VectorAdapterFromRaster extends RasterGraphic implements VectorGraphicInterface {

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
