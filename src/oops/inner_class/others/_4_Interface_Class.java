package oops.inner_class.others;

interface EmailService {

    public void sendMail(EmailService e);

    class EmailDetails {

    }

}

interface _4_Vehicle {

    public int getNoOfWheels();

    class DefaultVehicle implements _4_Vehicle {    // public & static

        @Override
        public int getNoOfWheels() {
            return 2;
        }
        
    }

}

class Bus implements _4_Vehicle {

    @Override
    public int getNoOfWheels() {
        return 6;
    }
    
}

class Test {
    public static void main(String[] args) {
        _4_Vehicle.DefaultVehicle d = new _4_Vehicle.DefaultVehicle();
        System.out.println(d.getNoOfWheels());

        Bus b  = new Bus();
        System.out.println(b.getNoOfWheels());
    }
}
