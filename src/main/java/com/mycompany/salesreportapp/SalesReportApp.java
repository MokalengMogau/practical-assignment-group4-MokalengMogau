/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreportapp;

/**
 *
 * @author lab_services_student
 */
public class SalesReportApp {
    public static void main(String[] args) {
        
        int[][] productSales = {
        {300, 150, 700},{250, 200, 600}};
       
        ProductSales report = new ProductSales();

        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("--------------------------------");
        System.out.println("Total sales: " + report.TotalSales(productSales));
        System.out.println("Average sales: " + report.AverageSales(productSales));
        System.out.println("Maximum sales: " + report.MaxSales(productSales));
        System.out.println("Minimum sales: " + report.MinSales(productSales));
        System.out.println("--------------------------------");
    }
}

    

