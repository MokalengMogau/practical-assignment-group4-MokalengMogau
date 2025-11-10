package com.mycompany.salesapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */

public class ProductSales implements IProductSales {
    
 private final int[][] productSales = {
        {300, 250},{150, 200},{700, 600}};
    private final int SALES_LIMIT = 500;

@Override
    public int[][] GetProductSales() {
    return productSales;
}

@Override
    public int GetTotalSales() {
        int total = 0;
        for (int[] sales : productSales) {
        for (int sale : sales) {
        total += sale;
            }
    }
    return total;
}

@Override
    public double GetAverageSales() {
        int total = GetTotalSales();
        int count = productSales.length * productSales[0].length;
        return (double) total / count;
    }

    @Override
    public int GetSalesOverLimit() {
        int count = 0;
        for (int[] sales : productSales) {
        for (int sale : sales) {
        if (sale > SALES_LIMIT) count++;
            }
        }
        return count;
    }

@Override
    public int GetSalesUnderLimit() {
        int count = 0;
        for (int[] sales : productSales) {
        for (int sale : sales) {
        if (sale <= SALES_LIMIT) count++;
            }
        }
        return count;
    }

@Override
    public int GetProductaProcessed() {
        return productSales[0].length; // Number of years
    }
}
 

