import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String [] arr = new String[] {"Queen","King"};

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(arr[0],arr[arr.length-1]);

        System.out.println(hashMap);


    }
}