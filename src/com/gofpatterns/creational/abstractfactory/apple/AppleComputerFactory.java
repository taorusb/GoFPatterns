package com.gofpatterns.creational.abstractfactory.apple;

import com.gofpatterns.creational.abstractfactory.*;

public class AppleComputerFactory implements ComputerFactory {
    @Override
    public Monitor createMonitor() {
        return new AppleMonitor();
    }

    @Override
    public Processor createProcessor() {
        return new AppleProcessor();
    }

    @Override
    public RAM createRAM() {
        return new AppleRAM();
    }

    @Override
    public SSD createSSD() {
        return new AppleSSD();
    }
}
