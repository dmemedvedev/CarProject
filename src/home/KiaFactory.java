package home;


import java.util.ArrayList;

public class KiaFactory extends Car {
        private int trunkCapacity;

        public KiaFactory(String color, String model, int year, int wheelSize, int engineVolume, ArrayList<String> options, int trunkCapacity) {
            super(color, model, year, wheelSize, engineVolume, options);
            this.trunkCapacity = trunkCapacity;
        }



    public int getTrunkCapacity() {
            return trunkCapacity;
        }

        public void setTrunkCapacity(int trunkCapacity) {
            this.trunkCapacity = trunkCapacity;
        }
    }

