package ru.learning.basepatterns.structural.adapter.throughcomposition.adapter;

import ru.learning.basepatterns.structural.adapter.throughcomposition.adaptee.RasterGraphic;
import ru.learning.basepatterns.structural.adapter.throughcomposition.target.VectorGraphicInterface;

public class VectorAdapterFromRaster implements VectorGraphicInterface {
    
    RasterGraphic rasterGraphic = new RasterGraphic();


    RasterGraphic rasterGraphicNew;

    // 1 способ - создать объект в классе адаптере
    public VectorAdapterFromRaster() {
    }

    // 2 способ - композиции можно передавать уже существующий объект
    public VectorAdapterFromRaster(RasterGraphic rasterGraphicNew) {
        this.rasterGraphicNew = rasterGraphicNew;
    }

    @Override
    public void drawLine() {
        rasterGraphic.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphic.drawRasterSquare();
    }
}
