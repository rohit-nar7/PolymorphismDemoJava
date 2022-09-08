public class Manual extends Transmission {


    public Manual(String transmissionType, String modelNo, int noOfGears) {
        super(transmissionType, modelNo, noOfGears);
    }

    @Override
    public double[] getGearRatio() {
        return super.getGearRatio();
    }

    @Override
    public void setGearRatio(double[] gearRatio) {
        super.setGearRatio(gearRatio);
    }

    @Override
    public void showSpecs() {
        super.showSpecs();
    }
}