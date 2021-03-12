package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import com.revrobotics.CANSparkMax;

public class r extends TimedRobot {
    public final DifferentialDrive robo; 
    Joystick xbox = new Joystick(0);            //creates new Joystick on port 0
    private Timer timer = new Timer();
    
    //PWM ports
    int PWML;
    int PWMR;


    public r(int PWM0, int PWM1){
        this.PWML = PWM0;
        this.PWMR = PWM1;
        robo = new DifferentialDrive(new PWMVictorSPX(PWML),new PWMVictorSPX(PWMR));
    }
    @Override
    public void robotInit(){}

    @Override 
    public void teleopInit() {}

    @Override
    public void teleopPeriodic(){
        robo.arcadeDrive(xbox.getY(), xbox.getX());
        
    }

}
