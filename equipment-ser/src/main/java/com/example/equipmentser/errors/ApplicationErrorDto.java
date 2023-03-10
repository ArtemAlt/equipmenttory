package com.example.equipmentser.errors;

import lombok.Data;

import java.util.Date;

/**
 * Обертка для возврата сообщений об ошибках
 */
@Data
public class ApplicationErrorDto {
    private int status;
    private String message;
    private Date timestamp;

    public ApplicationErrorDto(int status, String message) {
        this.status = status;
        this.message = message;
        this.timestamp = new Date();
    }
}
