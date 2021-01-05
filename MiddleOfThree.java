public class MiddleOfThree {
    int middle(int A, int B, int C){
        //code here
        if((A>B && C>A) || (A>C && B>A)) return A;
        if((A>B && B>C) || (B>A && C>B)) return B;
        return C;
    }
}
