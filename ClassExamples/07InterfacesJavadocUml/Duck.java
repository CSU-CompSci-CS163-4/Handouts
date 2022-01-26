public class Duck implements CanFly{
    int speed = 10;
    boolean isFlying = false;

    @Override
    public int getFlightSpeed() {
        return speed;
    }

    @Override
    public void setFlightSpeed(int speed) {
       this.speed = speed;
    }

    @Override
    public void takeOff() {
        isFlying = true;
    }

    @Override
    public boolean isFlying() {
        return isFlying; 
    }
    
}
