public class CircleRunner {
    public static void main(String[] args){
        Circle myCircle=new Circle(5);
        System.out.println(myCircle.getInfo());
        myCircle.setRadius(9.2);
        System.out.println(myCircle.getInfo());

        myCircle.setRadius(1);
        System.out.println(myCircle.getInfo());

    }
}
