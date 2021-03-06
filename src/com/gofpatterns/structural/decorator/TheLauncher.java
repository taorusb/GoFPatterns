package com.gofpatterns.structural.decorator;

public class TheLauncher {
    public static void main(String[] args) {
        LaserGun gun = new UltraFocusModel(new DispellingModel(new BaseModel()));
        System.out.println(gun.shoot());

    }
}
