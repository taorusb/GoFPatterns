package com.gofpatterns.structural.decorator;

public class DispellingModel extends LaserGunDecorator {

    public DispellingModel(LaserGun laserGun) {
        super(laserGun);
    }

    public String shootDissipativeRay() {
        return "Dispelling model shooting dispelled ray ";
    }

    @Override
    public String shoot(){
        return super.shoot() + shootDissipativeRay();
    }
}
