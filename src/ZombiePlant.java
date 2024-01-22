public class ZombiePlant {
    private int potency;
    private int treatmentTime;

    public ZombiePlant(int potency, int treatmentTime){
        this.potency = potency;
        this.treatmentTime = treatmentTime;
    }

    public int getPotency() {
        return potency;
    }

    public boolean isDangerous(){
        return treatmentTime>=1;
    }

    public void treat(int potency) {
        if (potency > 0) {
            if (potency <= this.potency && treatmentTime>0) {
                treatmentTime -= 1;
            } else if (potency>this.potency){
                treatmentTime += 1;
            }
        }
    }

    public int treatmentsNeeded(){
        return treatmentTime;
    }
}
