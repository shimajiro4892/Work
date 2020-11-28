public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("あなたの名前を入力してください");
        String name = new java.util.Scanner(System.in) .nextLine();
        System.out.println("あなたの年齢を入力してください。");
        int age = new java.util.Scanner(System.in) .nextInt();
        System.out.println("ようこそ、" + age + "歳の" + name + "さん");

    }
}
