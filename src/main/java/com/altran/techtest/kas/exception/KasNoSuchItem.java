package com.altran.techtest.kas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No such Item")
public class KasNoSuchItem extends RuntimeException {
}
