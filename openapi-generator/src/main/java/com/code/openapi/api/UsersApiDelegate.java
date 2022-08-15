package com.code.openapi.api;

import com.code.openapi.model.UserModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link UsersApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-15T20:36:28.222+05:30[Asia/Kolkata]")
public interface UsersApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /users/{userId} : get Api to fetch the user details by id
     * get Api to fetch the user details by id
     *
     * @param userId holds userId  (required)
     * @return UserModel details (status code 200)
     * @see UsersApi#getUserById
     */
    default ResponseEntity<UserModel> getUserById(Long userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"some text\", \"email\" : \"some text\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /users : Post Api to save users
     * Post Api to save users
     *
     * @param userModel Holds UserModel  (optional)
     * @return Success/failure (status code 200)
     * @see UsersApi#saveUser
     */
    default ResponseEntity<String> saveUser(UserModel userModel) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
