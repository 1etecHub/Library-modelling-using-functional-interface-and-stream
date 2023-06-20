package com.theLibrary.library.servicesImplementation;

import com.theLibrary.library.models.Library;
import com.theLibrary.library.models.Person;
import com.theLibrary.library.services.PersonServices;

public class PersonServicesImp implements PersonServices {
    @Override
    public String joinQueue(Person person, Library library) {
        library.getPersonQueue().add(person);
        return null;
    }


}
