package ru.netology.statistics;

public class StatisticsService  {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) {
        long current_max_index = 0;
        long current_max = incomes[0];
        for (long income : incomes) {
            if (current_max < income) {
                current_max = income;
            }
        }
        return current_max;
    }
//    public long findMax12_(long[] incomesInBillions) {
////        long current_max_index = 0;
//        long current_max = incomesInBillions[0];
//        for (long income : incomesInBillions) {
//            if (current_max <= income) {
//                current_max = income;
//            }
//        }
//        return current_max;
//    }
//
//    public long findMaxMonth(long[] incomesInBillions) {
////        long current_max_index = 0;
//        long current_max = incomesInBillions[0];
//        int maxMonth = 0;
//        int month = 0;
//        for (long income : incomesInBillions) {
//            if (current_max <= income) {
//                maxMonth++;
//            }
//            month = month +1;
//        }
//        return maxMonth;
//    }
//    public long findMaxIncome(long[] incomesInBillions) {
////        long current_max_index = 0;
//        long current_max = 0;
////        int maxMonth = 0;
//        int month = 0;
//        for (long income : incomesInBillions) {
//            if (current_max <= income) {
//                current_max = income;
//            }
//            month = month +1;
//        }
//        return current_max;
//    }
//
//    public long findMax12(long[] incomes) {
//        long current_max_index = 0;
////        long current_max = incomes[0];
//        for (long income : incomes) {
//            if (current_max_index <=income) {
//                current_max_index = income;
//            }
//        }
//        return current_max_index;
//    }
//    public long findMin(long[] incomes) {
//        long current_max_index = 0;
//        long current_min = incomes[0];
//        for (long income : incomes) {
//            if (current_min >= income) {
//                current_min = income;
//            }
//        }
//        return current_min;
//    }
}

