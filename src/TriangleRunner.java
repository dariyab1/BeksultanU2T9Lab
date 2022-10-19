public class TriangleRunner {
    public static void main(String[] args){
        RightTriangle triangle1=new RightTriangle();
        triangle1.Dimensions(3,4);
        double hyp1=triangle1.hypotenuse();
        RightTriangle triangle2=new RightTriangle();
        triangle2.Dimensions(9, 12);
        double hyp2=triangle2.hypotenuse();
        System.out.println(hyp1);
        System.out.println(hyp2);

    }
}
