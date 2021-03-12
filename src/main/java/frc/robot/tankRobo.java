package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.revrobotics.*;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class tankRobo extends TimedRobot{
    DifferentialDrive robo;
    CANSparkMax m_front_l;
    CANSparkMax m_front_r;
    Joystick j = new Joystick(0);

    //varaible declarations
    int lID;
    int rID;

    /*
    * @param lID: CAN ID of left motor  (set in the firmware)
    * @param rID: CAN ID of right motor (set in the firmware)
    */
    public tankRobo(int lID, int rID){
        m_front_l = new CANSparkMax(lID,MotorType.kBrushless);
        m_front_r = new CANSparkMax(rID, MotorType.kBrushless);
        robo = new DifferentialDrive(m_front_l, m_front_r);
    }

    @Override
    public void teleopInit(){
        if(robo == null)return;
        
    }

    @Override
    public void teleopPeriodic(){
        robo.tankDrive(j.getY(), j.getY());
    }
}
