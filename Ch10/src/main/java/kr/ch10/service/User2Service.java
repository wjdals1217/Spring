package kr.ch10.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ch10.dto.User2DTO;
import kr.ch10.entity.User1Entity;
import kr.ch10.entity.User2Entity;
import kr.ch10.repository.User1Repository;
import kr.ch10.repository.User2Repository;

@Service
public class User2Service {
	
	@Autowired
	private User2Repository repo;
	
	public void insertUser2(User2DTO user2) {
		repo.save(user2.toEntity());
	}
	public User2DTO selectUser2(String id) {
		return repo.findById(id).get().toDTO();
	}
	public List<User2DTO> selectUser2s() {
		return repo.findAll()
				.stream()
				.map(entity -> User2DTO.builder()
						.id(entity.getId())
						.name(entity.getName())
						.hp(entity.getHp())
						.age(entity.getAge())
						.build())
				.collect(Collectors.toList());
	}
	public void updateUser2(User2DTO user2) {
		repo.save(user2.toEntity());
	}
	public void deleteUser2(String id) {
		repo.deleteById(id);
	}
	
}
