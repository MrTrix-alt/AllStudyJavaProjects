package ru.learning.basepatterns.structural.adapter.throughcomposition;

import ru.learning.basepatterns.structural.adapter.throughcomposition.adaptee.RasterGraphic;
import ru.learning.basepatterns.structural.adapter.throughcomposition.adapter.VectorAdapterFromRaster;
import ru.learning.basepatterns.structural.adapter.throughcomposition.target.VectorGraphicInterface;


class AdapterApp {
    public static void main(String[] args) {
        VectorGraphicInterface graphicInterface = new VectorAdapterFromRaster();
        graphicInterface.drawLine();
        graphicInterface.drawSquare();

        // Используем уже существующий объект растовой графики,
        // чтобы передать его в адаптер, где можно будет воспользоваться методами,
        // который хочет использовать клиент (пользователь)
        RasterGraphic rasterGraphic = new RasterGraphic();
        VectorGraphicInterface graphicInterfaceNew = new VectorAdapterFromRaster(rasterGraphic);
        graphicInterfaceNew.drawLine();
        graphicInterfaceNew.drawSquare();
    }
}
