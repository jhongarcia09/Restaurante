package com.example.Restaurantefinal.dto;

public class MenuErrorDTO extends MenuDTO{

    private String messageErro;

    public String getMessageErro() {
        return messageErro;
    }

    public void setMessageErro(String messageErro) {
        this.messageErro = messageErro;
    }
}
