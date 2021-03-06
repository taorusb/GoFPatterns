package com.gofpatterns.creational.abstractfactory;

import com.gofpatterns.creational.abstractfactory.apple.AppleComputerFactory;

public class AppleComputer {
    public static void main(String[] args) {

        AppleComputerFactory computerFactory = new AppleComputerFactory();
        Monitor monitor = computerFactory.createMonitor();
        Processor processor = computerFactory.createProcessor();
        RAM ram = computerFactory.createRAM();
        SSD ssd = computerFactory.createSSD();

        ssd.saveData();
        ram.getData();
        processor.execute();
        monitor.showData();
    }
}
