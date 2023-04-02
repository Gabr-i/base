package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;

import org.junit.Assert;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {
    private TrainController trainC;
    private TrainUser trainU;

    @Before
    public void before() {
        // TODO Add initializations
    }

    @Test
    public void tachographEmptyTest() {
        TrainSensorImpl sensor = new TrainSensorImpl(trainC, trainU);
        sensor.tachographRecordAdd();
        assertFalse(sensor.getTachogarph().isEmpty());
    }
}
