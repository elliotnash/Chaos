// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  private final MotorControllerGroup left = new MotorControllerGroup(
          new WPI_VictorSPX(Constants.Motors.FRONT_LEFT_CAN_ID),
          new WPI_VictorSPX(Constants.Motors.BACK_LEFT_CAN_ID)
  );
  private final MotorControllerGroup right = new MotorControllerGroup(
          new WPI_VictorSPX(Constants.Motors.FRONT_RIGHT_CAN_ID),
          new WPI_VictorSPX(Constants.Motors.BACK_RIGHT_CAN_ID)
  );

  public Drivetrain() {}

  public void setOutput(double left, double right) {
    this.left.set(left);
    this.right.set(right);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
