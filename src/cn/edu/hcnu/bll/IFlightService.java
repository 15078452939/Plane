package cn.edu.hcnu.bll;

import cn.edu.hcnu.bean.Flight;

import java.util.Set;

public interface IFlightService {
    void insertFlights(Flight flight);
    Set<Flight> getALLFlights();  // Flight类的集合
    Flight getFlightByDepartureTime(String dapartureTime);
    Flight getFlightByDepartureAirPort(String dapartureAirPort);
    Flight getFlightByDestinationAirPort(String DestinationAirPort);
    void updateFlight(Flight flight);
}
