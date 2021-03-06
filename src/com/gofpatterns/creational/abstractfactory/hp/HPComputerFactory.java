package com.gofpatterns.creational.abstractfactory.hp;

import com.gofpatterns.creational.abstractfactory.*;

public class HPComputerFactory implements ComputerFactory {
    @Override
    public Monitor createMonitor() {
        return new HPMonitor();
    }

    @Override
    public Processor createProcessor() {
        return new HPProcessor();
    }

    @Override
    public RAM createRAM() {
        return new HPRAM();
    }

    @Override
    public SSD createSSD() {
        return new HPSSD();
    }
}
