package telran.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("calculator")
public class CalculatorController {
	@GetMapping("add")
	double add(double op1, double op2) {
		return op1 + op2;
	}

	@GetMapping("subtraction")
	double subtraction(double op1, double op2) {
		return op1 - op2;
	}

	@GetMapping("multiplication")
	double multiplication(double op1, double op2) {
		return op1 * op2;
	}

	@GetMapping("division")
	double division(double op1, double op2) {
		
		if (op2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return  op1 / op2;
	}
	
	 @ExceptionHandler(IllegalArgumentException.class)
	    public String handleIllegalArgumentException(IllegalArgumentException ex) {
	        return "Error: " + ex.getMessage();
	    }

}
