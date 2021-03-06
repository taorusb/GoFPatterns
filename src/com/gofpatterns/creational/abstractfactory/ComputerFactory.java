package com.gofpatterns.creational.abstractfactory;

public interface ComputerFactory {
    Monitor createMonitor();
    Processor createProcessor();
    RAM createRAM();
    SSD createSSD();
}
