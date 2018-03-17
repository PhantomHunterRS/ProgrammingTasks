import Chapter1.Task8;

/**
 * PHANTOMHUNTER
 **/
public class Main {
    public static void main(String[] args) {
//        Task8 task = new Task8();
//        task.Perimetr(16,4);
        System.out.println(subtractSum(9999));
    }
        public static String subtractSum (int n){
            String[] fruit = new String[]{"kiwi", "pear", "kiwi", "banana", "melon", "banana", "melon", "pineapple", "apple", "pineapple", "cucumber", "pineapple", "cucumber", "orange", "grape", "orange", "grape", "apple", "grape", "cherry", "pear", "cherry", "pear", "kiwi", "banana", "kiwi", "apple", "melon", "banana", "melon", "pineapple", "melon", "pineapple",
                        "cucumber", "orange", "apple", "orange", "grape", "orange", "grape", "cherry", "pear", "cherry", "pear", "apple", "pear", "kiwi", "banana", "kiwi", "banana", "melon", "pineapple", "melon", "apple", "cucumber", "pineapple", "cucumber", "orange", "cucumber", "orange", "grape", "cherry", "apple", "cherry", "pear", "cherry"
                        , "pear", "kiwi", "pear", "kiwi", "banana", "apple", "banana", "melon", "pineapple", "melon", "pineapple", "cucumber", "pineapple", "cucumber", "apple", "grape", "orange", "grape", "cherry", "grape"
                        , "cherry", "pear", "cherry", "apple", "kiwi", "banana", "kiwi", "banana", "melon", "banana", "melon", "pineapple", "apple", "pineapple"
            };
            while (n > 10) {
                int sum = (n / 10000) + ((n % 10000) / 1000) + (((n % 10000) % 1000) / 100) + (((n % 10000) % 1000) % 100) / 10 + (((n % 10000) % 1000) % 100) % 10;
                n = n - sum;
                System.out.println(n +" " + sum);
            }
            return fruit[n-1];
        }
    }
