package com.altran.techtest.kas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="Client Exception")
public class KasClientException extends RuntimeException {
}
