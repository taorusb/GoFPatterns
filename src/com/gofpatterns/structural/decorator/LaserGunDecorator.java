package com.gofpatterns.structural.decorator;

public class LaserGunDecorator implements LaserGun {

    private LaserGun laserGun;

    public LaserGunDecorator(LaserGun laserGun) {
        this.laserGun = laserGun;
    }

    @Override
    public String shoot() {
        return laserGun.shoot();
    }
}
