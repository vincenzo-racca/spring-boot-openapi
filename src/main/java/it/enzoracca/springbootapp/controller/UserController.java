//package it.enzoracca.springbootapp.controller;
//
//import io.swagger.annotations.Api;
//import io.swagger.v3.oas.annotations.OpenAPIDefinition;
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.annotations.media.Content;
//import io.swagger.v3.oas.annotations.media.Schema;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
//import io.swagger.v3.oas.annotations.tags.Tag;
//import it.enzoracca.springbootapp.entities.User;
//import it.enzoracca.springbootapp.repo.UserRepository;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.util.CollectionUtils;
//import org.springframework.web.bind.annotation.*;
//
//
//@RestController
//@RequestMapping("/user")
//@Api(tags = "User Resource")
//@Tag(name = "User Resource", description = "api che gestiscono l'entità User")
//public class UserController {
//
//    private UserRepository userRepository;
//
//    public UserController(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @GetMapping
////    @ApiResponse(responseCode = "200",description = "Users found",
////            content = @Content(schema = @Schema(implementation = ResponseEntity.class)))
////    @ApiResponse(responseCode = "204",description = "Users not found")
//    @Operation(summary = "Read country by ISO 3166-1 alpha-2 code", responses = {
//            @ApiResponse(responseCode = "200", description = "Users found", content = @Content(mediaType = "application/json")),
//            @ApiResponse(responseCode = "204",description = "Users not found")
//    })
//    public ResponseEntity<Page<User>> findAll(@RequestParam(required = false, defaultValue = "0") Integer page,
//                                          @RequestParam(required = false, defaultValue = "10") Integer size,
//                                          @RequestParam(required = false, defaultValue = "id") String sort) {
//
//        Page<User> response;
//        if(sort != null) {
//            response = userRepository.findAll(PageRequest.of(page, size, Sort.by(sort)));
//        }
//        else {
//            response = userRepository.findAll(PageRequest.of(page, size));
//        }
//
//        if(CollectionUtils.isEmpty(response.getContent())) {
//            return ResponseEntity.noContent().build();
//        }
//
//        else {
//            return ResponseEntity.ok(response);
//        }
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public User insertUser(@RequestBody User user) {
//        return userRepository.save(user);
//    }
//}
