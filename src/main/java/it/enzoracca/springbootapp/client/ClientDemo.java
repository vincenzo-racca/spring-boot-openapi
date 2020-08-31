package it.enzoracca.springbootapp.client;

import org.openapitools.client.ApiException;
import org.openapitools.client.api.UserEntityApi;
import org.openapitools.client.model.CollectionModelOfUser;
import org.openapitools.client.model.EntityModelOfUser;
import org.openapitools.client.model.User;

public class ClientDemo {

    public static void main(String... args) throws ApiException {
        UserEntityApi userEntityApi = new UserEntityApi();

        User user = new User();
        user.setName("Mario");
        user.setSurname("Rossi");
        EntityModelOfUser userRet = userEntityApi.saveUserUsingPOST(user);
        System.out.println("UTENTE INSERITO: " + userRet);
        CollectionModelOfUser allUsers = userEntityApi.findAllUserUsingGET(null, null, null);
        System.out.println("GET ALL: " + allUsers);

    }
}
