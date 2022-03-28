public class Racer implements Runnable {
    Car c;
    int distance = 1000;
    public Racer(Car c) {
        this.c = c;
    }
    @Override
    public void run() {
        try {
            while (c.odometer < distance) {
                if (c.miles == 0) {
                    System.out.println("charging");
                    c.charge();
                    Thread.sleep((int) c.maxMiles);
                }
                c.move(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}/* TODO
This class is exactly as the Racer from Task 1*/

