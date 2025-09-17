package main;

import java.util.LinkedList;
import java.util.List;

public class Station {
    private int idStation;
    private int capacity;
    private List<Position> listPositions = new LinkedList<Position>();

    public void addPosition() {
        listPositions.add(new Position());
    }

    public void deletePosition() {
        listPositions.remove(listPositions.size() - 1);
    }

    public int getIdStation() {
        return idStation;
    }

    public void setIdStation(int idStation) {
        this.idStation = idStation;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public class Position {
        private PositionState state = PositionState.AVAILABLE;

        public PositionState getState() {
            return state;
        }

        public void setState(PositionState state) {
            this.state = state;
        }

    }
}
