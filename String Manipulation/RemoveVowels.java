public class RemoveVowels {
    public static void main(String[] args) {
        String str = "Mindtree";
        System.out.println(str.replaceAll("[aeiouAEIOU]", ""));
    }
}
