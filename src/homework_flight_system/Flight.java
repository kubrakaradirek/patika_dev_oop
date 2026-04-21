package homework_flight_system;

import java.util.Date;

public class Flight extends BaseEntity{
    private String id;
    private Airport kalkisHavaalani;
    private Airport inisHavaalani;
    private Pilot pilot;
    private Pilot yardimciPilot;
    private Aircraft ucak;
    private Date kalkisSaati;
    private Date inisSaati;
}