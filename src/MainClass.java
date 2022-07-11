 import processing.core.PApplet;

public class MainClass extends PApplet {

    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    public static final int Diameter = 15;
    int x1=0;
    int x2=0;
    int x3=0;
    int x4=0;


    public static void main(String[] args) {
        PApplet.main("MainClass",args);

    }
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {

        createC1();
        createC2();
        createC3();
        createC4();


    }

    private void createC4() {
        ellipse(x4,4*(HEIGHT/5), Diameter, Diameter);
        x4+=4;
    }

    private void createC3() {
        ellipse(x3,3*(HEIGHT/5), Diameter, Diameter);
        x3+=3;
    }

    private void createC2() {
        ellipse(x2,2*(HEIGHT/5), Diameter, Diameter);
        x2+=2;
    }

    private void createC1() {
        ellipse(x1,HEIGHT/5, Diameter, Diameter);
        x1++;
    }


    private void getBackground() {
        background(255);
    }
}
