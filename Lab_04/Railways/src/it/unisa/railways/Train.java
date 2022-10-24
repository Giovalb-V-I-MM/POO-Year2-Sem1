package it.unisa.railways;

import java.util.List;

public class Train {
    private final TrainStop departureStation;
    private final TrainStop arrivalStation;
    private final List<TrainStop> intermediateStops;
    private final int numberOfSeats;
    private final double traveledKms;

    public Train(TrainStop departureStation, TrainStop arrivalStation, List<TrainStop> intermediateStops, int numberOfSeats, double traveledKms){
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
        this.intermediateStops = intermediateStops;
        this.numberOfSeats = numberOfSeats;
        this.traveledKms = traveledKms;
    }

    public TrainStop getDepartureStation(){
        return departureStation;
    }

    public TrainStop getArrivalStation(){
        return arrivalStation;
    }

    public List<TrainStop> getIntermediateStops(){
        return intermediateStops;
    }

    public int getNumberOfSeats(){
        return numberOfSeats;
    }

    public double getTraveledKms(){
        return traveledKms;
    }

    public int getTotalNumberOfStops(){
        return intermediateStops.size() + 2;
    }

    public double computeMaxRevenues(double serviceRevenuePerKmPerson){
        return this.traveledKms * this.numberOfSeats * serviceRevenuePerKmPerson;
    }
}