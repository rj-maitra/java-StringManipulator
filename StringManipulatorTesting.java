public class StringManipulatorTesting { 
    public static void main(String[] args) {

        StringManipulator manipulator1 = new StringManipulator();
        String str = manipulator1.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); // HelloWorld
        System.out.println("------------------------------");

        StringManipulator manipulator2 = new StringManipulator();
        char letter = 'o';
        Integer a = manipulator2.getIndexOrNull("Coding", letter);
        Integer b = manipulator2.getIndexOrNull("Hello World", letter);
        Integer c = manipulator2.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(b); // 4
        System.out.println(c); // null
        System.out.println("------------------------------");

        StringManipulator manipulator3 = new StringManipulator();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer x = manipulator3.getIndexOrNull(word, subString);
        Integer y = manipulator3.getIndexOrNull(word, notSubString);
        System.out.println(x); // 2
        System.out.println(y); // null
        System.out.println("------------------------------");

        StringManipulator manipulator4 = new StringManipulator();
        String newWord = manipulator4.concatSubstring("Hello", 1, 2, "world");
        System.out.println(newWord); // eworld
        System.out.println("------------------------------");
    }
}