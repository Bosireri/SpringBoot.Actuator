package tech.getarrays.ActuatorEmp.Manager.manager;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Endpoint(id = "custom")
@Component
public class CustomerActuatorEndpoint {

    @ReadOperation
    public Map<String, String> customEndpoint(String username) {
        Map<String, String> map = new HashMap<>();
        map.put("Key", "Value");
        //You include the following sequence when GetMapping on your browser's localhost "localhost:8080/admin/custom?username=Richard"
        //but can work directly when the parenthesis is included on the ('username')
        map.put("username", username);
        return map;
    }
}