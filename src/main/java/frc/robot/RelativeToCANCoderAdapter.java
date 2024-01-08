package frc.robot;
import com.ctre.phoenix.sensors.CANCoder;
public class RelativeToCANCoderAdapter {

    private final CANCoder relativeEncoder;

    public RelativeToCANCoderAdapter(CANCoder relativeEncoder) {
        this.relativeEncoder = relativeEncoder;
    }

    // Implement adapter methods based on the CANCoder interface
    public double getPosition() {
        return relativeEncoder.getPosition();
    }

    public void setPosition(double position) {
        relativeEncoder.setPosition(position);
    }

    // Optionally, add any additional methods or customization needed
}
