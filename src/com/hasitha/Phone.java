package com.hasitha;

import java.math.BigDecimal;

public class Phone {

    private String os;
    private double camera;
    private BigDecimal price;
    private double weight;
    private String company;

    private Phone(Builder builder){
        this.os = builder.os;
        this.camera = builder.camera;
        this.price = builder.price;
        this.weight = builder.weight;
        this.company = builder.company;
    }



    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", camera=" + camera +
                ", price=" + price +
                ", weight=" + weight +
                ", company='" + company + '\'' +
                '}';
    }


    public static class Builder {

        private String os;
        private double camera;
        private BigDecimal price;
        private double weight;
        private String company;

        public Builder setOs(String os) {
            this.os = os;
            return this;
        }

        public Builder setCamera(double camera) {
            this.camera = camera;
            return this;
        }

        public Builder setPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Phone build(){
            return new Phone(this);
        }
    }
}
