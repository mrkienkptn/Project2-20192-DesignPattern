package agency;

import java.util.List;
import factory.*;
public interface Agency {
    void update(String msg, List<Motor> list);
    void importMotor(Motor motor, int num);
}