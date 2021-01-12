package cn.edu.hcnu.dao;
import cn.edu.hcnu.bean.Flight;
import java.util.Set;
    interface IFlight{
        void insertFlights(Flight flight);
        Set<Flight> getALLFlights();
        Flight getFlightByDepartureTime(String dapartureTime);
        Flight getFlightByDepartureAirPort(String dapartureAirPort);
        Flight getFlightByDestinationAirPort(String DestinationAirPort);
        void updateFlight(Flight flight);
    }

