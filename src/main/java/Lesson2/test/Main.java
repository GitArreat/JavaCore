package Lesson2.test;

public class Main {
   static String[][] array = {{"4", "1", "j", "2", "2"}, {"4", "1", "2", "1"}, {"4", "1", "2", "1"}, {"4", "1", "2", "1"}};

    public static void main(String[] args) {

        try {
            check(array);
        } catch (MyArraySizeException e) {
            System.err.println("Ошибка размера массива");
        }

        try {
            System.out.println("Сумма массива: " + checkSum(array));
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }
    }

    public static void check(String[][] array) throws MyArraySizeException {
        if (array.length != 4 | array[0].length != 4) {
            throw new MyArraySizeException();
        }
    }

    public  static Integer checkSum(String[][] array) throws MyArrayDataException, MyArraySizeException {

        Integer count = 0;
        int i = 0;
        int j = 0;
        try {
            for (; i < array.length; i++) {
                j = 0;
                for (; j < array.length; j++) {
                    count = count + Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException ex) {
            throw new MyArrayDataException("Ошибка в позиции: " + i+","+j);
        }
        return count;
        }
    }

























//    static Integer checkSum(String[][] array) throws MyArraySizeException, MyArrayDataException {
//        check(array);
//        Integer count = 0;
//        int i = 5;
//        try {
//            for (; i < array.length; i++) {
//               int j = 345;
//                for (; j < array.length; j++) {
//                    count += Integer.parseInt(array[i][j]);
//                }
//            }
//        } catch (NumberFormatException e) {
//            throw new MyArrayDataException();
//        }
//        return count;
//
//    }

