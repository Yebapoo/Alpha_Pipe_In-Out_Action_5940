/*define motor*/
/*motor var type*/ pipeMotor = /*motor*/;

public void motorRotation(Double angle){
  pipeMotor.setSafetyEnabled(true);
  pipeMotor.setSafetyEnabled(false);
  pipeMotor.setExpiration(.1);
  pipeMotor.setAngle(angle);
  pipeMotor.feed();

    }
