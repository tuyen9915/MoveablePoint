//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(2f,4f,5f,6f);
        System.out.println(moveablePoint);

        moveablePoint.move();
        System.out.println(moveablePoint);

    }
}