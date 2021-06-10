package kodlamaIo.northwind.api.controlers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sun.jdi.Method;

import kodlamaIo.northwind.business.abstracts.UserService;
import kodlamaIo.northwind.core.entities.User;
import kodlamaIo.northwind.core.utilities.results.ErrorDataResult;
import kodlamaIo.northwind.core.utilities.results.Result;
@RestController
@RequestMapping("api/users")
public class UsersController {
	
	private UserService userService;
    @Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@Valid @RequestBody User user) {
		return ResponseEntity.ok(this.userService.add(user));
		}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidatonException
	(MethodArgumentNotValidException exception){
		
		Map<String, String> validationErrors = new HashMap<String, String>();
		for(FieldError fielError: exception.getBindingResult().getFieldErrors()) {
			validationErrors.put(fielError.getField(), fielError.getDefaultMessage());
		}
	
		ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors,"Doğrulama Hataları");
		return errors;
		
		
	}
	
	
	
	
	
	

}