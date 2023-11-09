package ru.netology.stats;

public class StatsService {
    public int calculateTotalSales(int[] sales) { //Метод для расчета суммы всех продаж
        int totalSales = 0;
        for (int sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public double calculateAverageSales(int[] sales) { //Метод для расчета средней суммы продаж в месяц
        int totalSales = calculateTotalSales(sales);
        return (double) totalSales / sales.length;
    }

    public int findPeakMonth(int[] sales) { //Метод для определения номера месяца в котором был пик продаж
        int maxSale = sales[0];
        int peakMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSale) {
                maxSale = sales[i];
                peakMonth = i;
            }
        }
        return peakMonth + 1;
    }

    public int findMinMonth(int[] sales) { //Метод для определения номера месяца в котором был минимум продаж
        int minSale = sales[0];
        int minMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < minSale) {
                minSale = sales[i];
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int countMonthsBelowAverage(int[] sales) { // Метод для подсчета количества месяцев в которых продажи были ниже среднего
        double averageSales = calculateAverageSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }
        return count;
    }

    public int countMonthsAboveAverage(int[] sales) { // Метод для подсчета количества месяцев в которых продажи были выше среднего
        double averageSales = calculateAverageSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }
        return count;
    }
}