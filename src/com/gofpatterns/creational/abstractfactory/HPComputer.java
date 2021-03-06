package com.gofpatterns.creational.abstractfactory;

import com.gofpatterns.creational.abstractfactory.hp.HPComputerFactory;

public class HPComputer {
    public static void main(String[] args) {

        HPComputerFactory computerFactory = new HPComputerFactory();
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
