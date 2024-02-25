package oops.inner_class.others;

class VehicleTypes {

    interface Vehicle {     // static
        public int getNoOfWheels();
    }

    class Bus implements Vehicle {

        @Override
        public int getNoOfWheels() {
            return 6;
        }
        
    }

    class Auto implements Vehicle {

        @Override
        public int getNoOfWheels() {
            return 3;
        }
        
    }
}
