package oops.constructors;

import java.io.IOException;

class P {
    P() throws IOException {

    }
}


// CE: Default constructor cannot handle exception type IOException thrown by implicit super constructor. Must define an explicit constructor
class C extends P {

    C() throws IOException {
        super();
    }

    // CE: super() must be first statement
    
    // C() {
    //     try {
    //         super();
    //     } catch (IOException e) {}
    // }
    
}
