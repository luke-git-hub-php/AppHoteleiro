package br.edu.infnet.appHoleteiro.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Food;

import br.edu.infnet.appHoleteiro.model.domain.FoodService;
import br.edu.infnet.appHoleteiro.model.repository.FoodRepository;

@Service
public class FoodService {
	@Autowired 
	private FoodRepository foodRepository;
	
	public void Add(Food apartment) {
		foodRepository.Save(leisure);
	}
	
	public void Remove(Integer id) {
		foodRepository.DeleteById(id);
	}
	
	public Collection<Food> GetList(){
		return (Collection<Food>) foodRepository.findAll();
	}
	
	public Optional<Food> GetById(Integer id){
		return foodRepository.findById(id);
	}
}