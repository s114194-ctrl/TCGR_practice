package frc.robot;
 
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkMaxConfig;
 
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
 

public class Robot extends TimedRobot {
 
  private static final int MOTOR_ID = 12;   
 
  private final SparkMax motor = new SparkMax(MOTOR_ID, MotorType.kBrushless);
  private final XboxController controller = new XboxController(0);
 
  public Robot() {
    SparkMaxConfig config = new SparkMaxConfig();
    config.idleMode(IdleMode.kBrake);  
    config.smartCurrentLimit(40);         
    config.openLoopRampRate(0.5);  
    motor.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
  }
 
  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {}
 
  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
  
}