package lejos.hardware.port;

import lejos.internals.EV3DevPort;

/**
 * Basic interface for EV3 motors ports.
 *
 * @author Andy Shaw
 * @author Juan Antonio Breña Moral
 *
 */
public interface MotorPort {

	Port A = new EV3DevPort("A", EV3DevPort.MOTOR_PORT, 0);
	Port B = new EV3DevPort("B", EV3DevPort.MOTOR_PORT, 1);
	Port C = new EV3DevPort("C", EV3DevPort.MOTOR_PORT, 2);
	Port D = new EV3DevPort("D", EV3DevPort.MOTOR_PORT, 3);
}
