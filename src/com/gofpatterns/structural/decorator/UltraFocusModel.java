package com.gofpatterns.structural.decorator;

public class UltraFocusModel extends LaserGunDecorator {

    public UltraFocusModel(LaserGun laserGun) {
        super(laserGun);
    }

    public String shootFocusedRay() {
        return "Ultra Focus Model shooting focused ray";
    }

    @Override
    public String shoot() {
        return super.shoot() + shootFocusedRay();
    }
}
