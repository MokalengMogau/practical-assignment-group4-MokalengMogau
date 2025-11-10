package com.mycompany.salesreportapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */

 public class ProductSales implements IProduct {

@Override
public int TotalSales(int[][] productSales) {
    int total = 0;
    for (int[] year : productSales) {
    for (int sale : year) {
        
    total += sale;
        }
    }
        return total;
}

@Override
public double AverageSales(int[][] productSales) {
        int total = TotalSales(productSales);
        int count = productSales.length * productSales[0].length;
        return (double) total / count;
    }

@Override
public int MaxSales(int[][] productSales) {
    int max = Integer.MIN_VALUE;
    for (int[] year : productSales) {
    for (int sale : year) {
    if (sale > max) max = sale;
        }
    }
        return max;
}

@Override
public int MinSales(int[][] productSales) {
    int min = Integer.MAX_VALUE;
    for (int[] year : productSales) {
    for (int sale : year) {
       if (sale < min) min = sale;
        }
    }
    return min;
  }
}


