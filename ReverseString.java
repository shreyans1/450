
class ReverseString{

    public static String reverseWord(String str)
    {
        StringBuilder s = new StringBuilder(str);
        return s.reverse().toString();
    }
}