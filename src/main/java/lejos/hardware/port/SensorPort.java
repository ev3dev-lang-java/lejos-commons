package lejos.hardware.port;

import lejos.internals.EV3DevPort;

/**
 * Basic interface for EV3 sensors ports.
 * 
 * @author Andy Shaw
 * @author Juan Antonio Breña Moral
 *
 */
public interface SensorPort {

    Port S1 = new EV3DevPort("S1", EV3DevPort.SENSOR_PORT, 0);
    Port S2 = new EV3DevPort("S2", EV3DevPort.SENSOR_PORT, 1);
    Port S3 = new EV3DevPort("S3", EV3DevPort.SENSOR_PORT, 2);
    Port S4 = new EV3DevPort("S4", EV3DevPort.SENSOR_PORT, 3);
}
