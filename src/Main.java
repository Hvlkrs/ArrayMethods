import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //asList() method--> Converting elements into list

        int Arr[] = { 10, 30, 35, 52, 75 };
        System.out.println("The Integer Array as a List = "+ Arrays.asList(Arr));

        //binarySearch() method-->
        int Arr1[] = { 10, 30, 35, 52, 75 };
        Arrays.sort(Arr1);
        int ele = 35;
        System.out.println (ele  + " is found at index = " + Arrays.binarySearch(Arr1, ele));


        //compareUnsigned() method
        int m = 10;
        int n = 20;
// as 10 less than 20, the output would be a value less than zero
        System.out.println(Integer.compareUnsigned(m, n));
        int x = 8;
        int y = 8;
// as 8 equals 8, Output would be zero
        System.out.println(Integer.compareUnsigned(x, y));
        int e = 25;
        int f = 8;
// as 25 is greater than 8, Output would be a value greater than zero
        System.out.println(Integer.compareUnsigned(e, f));
        int o = 15;
        int p = -7;
// as 15 is greater than -7 but -7 would be treated as an unsigned number
// which will be greater than 15
// Output would be a value less than zero
        System.out.println(Integer.compareUnsigned(o, p));



        //copyOf() method
        int Arr2[] = { 10, 25, 55, 22, 35};
// Printing the elements in a single line
        System.out.println("The Integer Array is: " + Arrays.toString(Arr2));
        System.out.println("\nThe new Arrays fetched by copyOf is :\n");
        System.out.println("Integer Array is: " + Arrays.toString(Arrays.copyOf(Arr2, 10)));


        //copyOfRange(the previous array, startIndex, finishIndex) CopyOfRange method would copy the mentioned range of the mentioned array into a new Array.

        int Arr3[] = {20, 30, 15, 22, 35 };
// Printing the elements in a single line
        System.out.println("Integer Array is: " + Arrays.toString(Arr3));
        System.out.println("\nThe new Arrays through copyOfRange is :\n");
        System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOfRange(Arr3, 1, 3)));

        //static boolean deepEquals(Object[] m1, Object[] m2) DeepEquals method would return true in case the two mentioned arrays are deeply equal to the other array or not.

        int Arr4[][] = { {10, 20, 35, 82, 95} };
// Fetching second Array
        int Arr5[][] = { { 10, 15, 22 } };
// Comparing both arrays
        System.out.println("Arrays when compared: " + Arrays.deepEquals(Arr4, Arr5));


        //static int deepHashCode(Object[] a): deepHashCode
        //Method would return the hash code depending upon “deep contents” of the mentioned arrays.
        int Arr6[][] = { { 10, 20, 15, 22, 35} };
// Getting deep hashCode of arrays
        System.out.println(Arrays.deepHashCode(Arr6));

        // regionMatches(): İki dizi bölgesinin eşit olup olmadığını test eder. boolean döndürür.
        String str1 = "Merhaba, Dünya!";
        String str2 = "merhaba, dünya!";

        // Başlangıç pozisyonu, karşılaştırılacak dizeler ve
        // Başlangıç dizininden itibaren kaç karakter karşılaştırılacağı
        boolean result = str1.regionMatches(true, 0, str2, 0, 8);

        if (result) {
            System.out.println("İki dize de aynı karakterleri içeriyor.");
        } else {
            System.out.println("İki dize aynı karakterleri içermiyor.");

            }
        }
        }
