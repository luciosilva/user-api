package com.luciofdasilva.userapi.converter;

import java.util.Date;

import com.luciofdasilva.shoppingclient.dto.UserDTO;
import com.luciofdasilva.userapi.models.User;

public class DTOConverter {


    public static UserDTO convert(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setNome(user.getNome());
		userDTO.setEndereco(user.getEndereco());
		userDTO.setCpf(user.getCpf());
		userDTO.setEmail(user.getEmail());
		userDTO.setTelefone(user.getTelefone());
		userDTO.setDataCadastro(user.getDataCadastro());
		userDTO.setKey(user.getKey());
		return userDTO;
	}

}
