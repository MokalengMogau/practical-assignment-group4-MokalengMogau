package com.mycompany.salesreportapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
public interface IProduct {
    int TotalSales(int[][] productSales);
    double AverageSales(int[][] productSales);
    int MaxSales(int[][] productSales);
    int MinSales(int[][] productSales);
}


