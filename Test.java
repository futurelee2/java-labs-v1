class Test{
    public static void main(String[] args){

        String names [] = {"Zoe", "mike", "Zoe"};
        System.out.println(names[0]==names[2]);


        String[] arr = new String[2];
        arr[0] = new String("hello");
        arr[1] = new String("hello");

        System.out.println(arr[0] == arr[1]);      // ❌ false (주소 비교)
        System.out.println(arr[0].equals(arr[1])); // ✅ true (값 비교)

    }
}