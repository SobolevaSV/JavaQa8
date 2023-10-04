package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales) { // сумма всех продаж
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageSales(long[] sales) { // средняя сумма продаж в месяц
        int sum = sumSales(sales);
        int average = sum / sales.length;
        return average;
    }

    public int maxSales(long[] sales) { // номер месяца, в котором был пик продаж
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) { // номер месяца, в котором был минимум продаж
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int downAverageSales(long[] sales) { // количество месяцев, в которых продажи были ниже среднего
        int count = 0;
        int average = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }

    public int upAverageSales(long[] sales) { // количество месяцев, в которых продажи были выше среднего
        int count = 0;
        int average = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }
}