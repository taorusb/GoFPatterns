package com.gofpatterns.behavioral.visitor;

public class CreatingProjectSimulator {
    public static void main(String[] args) {

        CompanyOne companyOne = new CompanyOne();
        CompanyTwo companyTwo = new CompanyTwo();
        Project project = new Project();

        System.out.println("First company begin building....");
        project.build(companyOne);
        System.out.println("\n**************\nSecond company begin building...");
        project.build(companyTwo);
    }
}
